package pl.com.turski.hermes.server.webservice;

import pl.com.turski.hermes.server.model.Address;
import pl.com.turski.hermes.server.model.Shipment;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * User: Adam
 */
@WebService
public interface ShipmentWS
{
	@WebMethod
	public Long registerShipment( @WebParam(name = "recipient") String recipient, @WebParam(name = "recipientAddress") Address recipientAddress );

	@WebMethod
	public Shipment checkShipment(@WebParam(name = "shipmentId") Long shipmentId);

}
