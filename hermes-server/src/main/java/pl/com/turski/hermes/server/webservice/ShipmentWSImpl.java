package pl.com.turski.hermes.server.webservice;

import org.springframework.beans.factory.annotation.Autowired;
import pl.com.turski.hermes.server.dao.ShipmentDao;
import pl.com.turski.hermes.server.model.Address;
import pl.com.turski.hermes.server.model.Shipment;

import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.Date;

/**
 * User: Adam
 */
@WebService(endpointInterface = "pl.com.turski.hermes.server.webservice.ShipmentWS", name = "shipmentWS")
public class ShipmentWSImpl implements ShipmentWS
{
	@Autowired
	ShipmentDao shipmentDao;

	@Override
	public Long registerShipment( @WebParam(name = "recipient") final String recipient, @WebParam(
		name = "recipientAddress") final Address recipientAddress )
	{

		Shipment shipment = new Shipment( recipient, recipientAddress, new Date() );
		Shipment createdShipment = shipmentDao.save( shipment );
		return createdShipment.getId();
	}
}
