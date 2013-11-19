package pl.com.turski.hermes.server.webservice;

import org.springframework.beans.factory.annotation.Autowired;
import pl.com.turski.hermes.server.dao.DeliveryDao;
import pl.com.turski.hermes.server.model.Address;
import pl.com.turski.hermes.server.model.Delivery;

import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.Date;

/**
 * User: Adam
 */
@WebService(endpointInterface = "pl.com.turski.hermes.server.webservice.DeliveryWS")
public class DeliveryWSImpl implements DeliveryWS
{
	@Autowired
	DeliveryDao deliveryDao;

	@Override
	public Long createDelivery( @WebParam( name = "recipient" ) final String recipient, @WebParam(
		name = "recipientAddress" ) final Address recipientAddress )
	{

		Delivery delivery = new Delivery(recipient,recipientAddress,new Date());
		Delivery createdDelivery = deliveryDao.save( delivery );
		return createdDelivery.getId();
	}
}
