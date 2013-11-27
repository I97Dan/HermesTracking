package pl.com.turski.hermes.server.webservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import pl.com.turski.hermes.server.model.Address;
import pl.com.turski.hermes.server.model.Shipment;
import pl.com.turski.hermes.server.service.ShipmentService;

import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * User: Adam
 */
@WebService( endpointInterface = "pl.com.turski.hermes.server.webservice.ShipmentWS", name = "shipmentWS" )
public class ShipmentWSImpl implements ShipmentWS
{
	@Autowired
	ShipmentService shipmentService;

	@Override
	@Transactional
	public Long registerShipment( @WebParam( name = "recipient" ) final String recipient, @WebParam(
		name = "recipientAddress" ) final Address recipientAddress )
	{
		return shipmentService.registerShipment( recipient, recipientAddress );
	}

	@Override
	@Transactional
	public Shipment checkShipment( @WebParam( name = "shipmentId" ) final Long shipmentId )
	{
		return shipmentService.checkShipment( shipmentId );
	}
}
