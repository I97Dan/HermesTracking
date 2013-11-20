package pl.com.turski.hermes.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import pl.com.turski.hermes.web.webservice.Address;
import pl.com.turski.hermes.web.webservice.DeliveryWS;

import java.util.ArrayList;
import java.util.List;

/**
 * User: Adam
 */
@Controller
@RequestMapping( value = "/delivery" )
public class DeliveryController
{
	@Autowired
	DeliveryWS deliveryWS;

	@RequestMapping( value = "/create", method = RequestMethod.GET )
	public ModelAndView createDeliveryPage()
	{
		ModelAndView mav = new ModelAndView( "delivery/new-delivery" );
		mav.addObject( "address", new Address() );
		return mav;
	}

	@RequestMapping( value = "/create", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE )
	@ResponseBody
	public Long createDelivery( @RequestBody String recipient, Address recipientAddress )
	{
		return deliveryWS.createDelivery( recipient, recipientAddress );
	}

	@RequestMapping( value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE )
	@ResponseBody
	public List<String> allDelivery()
	{
		return new ArrayList<>();
	}

	@RequestMapping( value = "", method = RequestMethod.GET )
	public ModelAndView allDeliveryPage()
	{
		ModelAndView mav = new ModelAndView( "delivery/all-delivery" );
		mav.addObject( "deliveries", allDelivery() );
		return mav;
	}

}
