package pl.com.turski.hermes.web.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import pl.com.turski.hermes.web.model.CreateDeliveryRequest;
import pl.com.turski.hermes.web.webservice.DeliveryWS;

/**
 * User: Adam
 */
@Controller
@RequestMapping(value = "/delivery")
public class DeliveryController
{
	private static final Logger logger = Logger.getLogger( DeliveryController.class );

	@Autowired
	DeliveryWS deliveryWS;

	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public ModelAndView createDeliveryPage()
	{
		logger.info( "New delivery page" );
		return new ModelAndView( "delivery/new-delivery" );
	}

	@RequestMapping( value = "/create", method = RequestMethod.POST )
	@ResponseBody
	public Long createDelivery( @RequestBody CreateDeliveryRequest createDeliveryRequest )
	{
		logger.info( "Delivery creation" );
		logger.debug( "createDeliveryRequest.recipient: " + createDeliveryRequest.getRecipient() );
		logger.debug( "createDeliveryRequest.recipientAddress: " + createDeliveryRequest.getRecipientAddress().toString() );

		Long id = deliveryWS.createDelivery( createDeliveryRequest.getRecipient(), createDeliveryRequest.getRecipientAddress() );

		logger.info( "Delivery created" );
		logger.debug( "id: " + id );
		return id;
	}

}
