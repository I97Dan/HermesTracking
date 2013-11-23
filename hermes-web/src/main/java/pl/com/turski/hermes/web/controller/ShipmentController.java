package pl.com.turski.hermes.web.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import pl.com.turski.hermes.web.model.RegisterShipmentRequest;
import pl.com.turski.hermes.web.webservice.ShipmentWS;

/**
 * User: Adam
 */
@Controller
@RequestMapping(value = "/shipment")
public class ShipmentController
{
	private static final Logger logger = Logger.getLogger( ShipmentController.class );

	@Autowired
	ShipmentWS shipmentWS;

	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public ModelAndView createShipmentPage()
	{
		logger.info( "New shipment page" );
		return new ModelAndView( "shipment/new-shipment" );
	}

	@RequestMapping( value = "/create", method = RequestMethod.POST )
	@ResponseBody
	public Long createShipment( @RequestBody RegisterShipmentRequest registerShipmentRequest )
	{
		logger.info( "Shipment creation" );
		logger.debug( "createShipmentRequest.recipient: " + registerShipmentRequest.getRecipient() );
		logger.debug( "createShipmentRequest.recipientAddress: " + registerShipmentRequest.getRecipientAddress().toString() );

		Long id = shipmentWS.registerShipment( registerShipmentRequest.getRecipient(), registerShipmentRequest.getRecipientAddress() );

		logger.info( "Shipment created" );
		logger.debug( "id: " + id );
		return id;
	}

}
