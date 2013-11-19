package pl.com.turski.hermes.server.webservice;

import pl.com.turski.hermes.server.model.Address;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * User: Adam
 */
@WebService
public interface DeliveryWS
{
	@WebMethod
	public Long createDelivery(@WebParam(name = "recipient") String recipient, @WebParam(name = "recipientAddress") Address recipientAddress);
}
