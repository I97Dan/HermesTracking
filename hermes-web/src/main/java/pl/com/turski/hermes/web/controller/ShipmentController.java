package pl.com.turski.hermes.web.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import pl.com.turski.hermes.web.model.CheckShipmentRequest;
import pl.com.turski.hermes.web.model.RegisterShipmentRequest;
import pl.com.turski.hermes.web.webservice.Shipment;
import pl.com.turski.hermes.web.webservice.ShipmentWS;

/**
 * User: Adam
 */
@Controller
@RequestMapping( value = "/shipment" )
public class ShipmentController
{
	private static final Logger logger = Logger.getLogger( ShipmentController.class );

	@Autowired
	ShipmentWS shipmentWS;

	@RequestMapping( value = "/create", method = RequestMethod.GET )
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
		logger.debug( "createShipmentRequest.recipientAddress: " + registerShipmentRequest.getRecipientAddress() );

		Long id = shipmentWS.registerShipment( registerShipmentRequest.getRecipient(), registerShipmentRequest.getRecipientAddress() );

		logger.info( "Shipment[" + id + "] created" );
		logger.debug( "id: " + id );
		return id;
	}

	@RequestMapping( value = "/check", method = RequestMethod.GET )
	public ModelAndView checkShipmentPage()
	{
		logger.info( "Check shipment page" );
		return new ModelAndView( "shipment/check-shipment" );
	}

	@RequestMapping( value = "/check", method = RequestMethod.POST )
	@ResponseBody
	public Shipment checkShipment( @RequestBody CheckShipmentRequest checkShipmentRequest )
	{
		logger.info( "Check shipment[" + checkShipmentRequest.getShipmentId() + "]" );
		logger.debug( "shipmentId: " + checkShipmentRequest.getShipmentId() );

		Shipment shipment = shipmentWS.checkShipment( checkShipmentRequest.getShipmentId() );

		if( shipment != null )
		{
			logger.info( "Shipment[" + checkShipmentRequest.getShipmentId() + "] found" );
			logger.debug( "shipment.id: " + shipment.getId() );
			logger.debug( "shipment.recipient: " + shipment.getRecipient() );
			logger.debug( "shipment.recipientAddress: " + shipment.getAddress() );
			logger.debug( "shipment.created: " + shipment.getCreated() );
			logger.debug( "shipment.shipmentStatusList.size: " + shipment.getShipmentStatusList().size() );
		}
		else
		{
			logger.info( "Shipment[" + checkShipmentRequest.getShipmentId() + "] not found" );
		}

		return shipment;
	}

}
