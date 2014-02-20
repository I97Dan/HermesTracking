package pl.com.turski.hermes.web.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import pl.com.turski.hermes.web.model.CheckShipmentForm;
import pl.com.turski.hermes.web.model.RegisterShipmentForm;
import pl.com.turski.hermes.web.validator.RegisterShipmentValidator;
import pl.com.turski.hermes.web.webservice.Shipment;
import pl.com.turski.hermes.web.webservice.ShipmentWS;

import java.util.List;

/**
 * User: Adam
 */
@Controller
public class ShipmentController {

    private static final Logger LOG = Logger.getLogger(ShipmentController.class);

    @Autowired
    ShipmentWS shipmentWS;

    @RequestMapping(value = "/shipment/create", method = RequestMethod.GET)
    public ModelAndView createShipmentPage() {
        LOG.debug("Create shipment");
        return new ModelAndView("shipment/create");
    }

    @RequestMapping(value = "/shipment/create", method = RequestMethod.POST)
    @ResponseBody
    public Long createShipment(@RequestBody RegisterShipmentForm registerShipmentForm, BindingResult bindingResult) {
        LOG.info("Shipment creation");
        LOG.debug("createShipmentRequest.recipient: " + registerShipmentForm.getRecipient());
        LOG.debug("createShipmentRequest.recipientAddress: " + registerShipmentForm.getRecipientAddress());

        RegisterShipmentValidator registerShipmentValidator = new RegisterShipmentValidator();
        registerShipmentValidator.validate(registerShipmentForm, bindingResult);

//		if(bindingResult.hasErrors()){
//			return new Response<>( bindingResult );
//		}

        Long id = shipmentWS.registerShipment(registerShipmentForm.getRecipient(), registerShipmentForm.getRecipientAddress());

        LOG.info("Shipment[" + id + "] created");
        LOG.debug("id: " + id);
//		return new Response<>( id );
        return id;
    }

    @RequestMapping(value = "/shipment/check", method = RequestMethod.GET)
    public ModelAndView checkShipmentPage() {
        LOG.info("Check shipment page");
        return new ModelAndView("shipment/check");
    }

    @RequestMapping(value = "/shipment/check", method = RequestMethod.POST)
    @ResponseBody
    public Shipment checkShipment(@RequestBody CheckShipmentForm checkShipmentForm) {
        try {
            LOG.info("Check shipment[" + checkShipmentForm.getShipmentId() + "]");

            Long shipmentId = Long.parseLong(checkShipmentForm.getShipmentId());

            Shipment shipment = shipmentWS.checkShipment(shipmentId);

            if (shipment != null) {
                LOG.info("Shipment[" + checkShipmentForm.getShipmentId() + "] found");
                LOG.debug("shipment.id: " + shipment.getId());
                LOG.debug("shipment.recipient: " + shipment.getRecipient());
                LOG.debug("shipment.recipientAddress: " + shipment.getAddress());
                LOG.debug("shipment.created: " + shipment.getCreated());
                LOG.debug("shipment.shipmentMovementList.size: " + shipment.getShipmentMovementList().size());
            } else {
                LOG.info("Shipment[" + checkShipmentForm.getShipmentId() + "] not found");
            }

            return shipment;
        } catch (NumberFormatException e) {
            return null;
        }
    }

    @RequestMapping(value = "/shipment/list", method = RequestMethod.GET)
    public ModelAndView shipmentListPage() {
        LOG.info("Check shipment page");
        List<Shipment> shipmentList = shipmentWS.shipmentList();
        ModelAndView mav = new ModelAndView("shipment/list");
        mav.addObject("shipmentList", shipmentList);
        return mav;
    }
}
