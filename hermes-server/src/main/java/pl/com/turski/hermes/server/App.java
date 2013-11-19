package pl.com.turski.hermes.server;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.com.turski.hermes.server.dao.AddressDao;
import pl.com.turski.hermes.server.dao.DeliveryDao;
import pl.com.turski.hermes.server.model.Address;
import pl.com.turski.hermes.server.model.Delivery;
import pl.com.turski.hermes.server.webservice.DeliveryWSImpl;

import java.util.Date;

/**
 * Hello world!
 */
public class App
{
	public static void main( String[] args )
	{
		ApplicationContext appContext = new ClassPathXmlApplicationContext( "classpath*:configuration.xml" );
		DeliveryWSImpl deliveryWS = new DeliveryWSImpl();
		Address address = new Address( "Warszawa", "Korotyńskiego", "21", "59", "21400", "Polska" );
		Delivery delivery = new Delivery( "Adam Turski", address, new Date() );
		Address address2 = new Address( "Warszawa", "Korotyńskiego", "21", "59", "21400", "Polska" );
		Delivery delivery2 = new Delivery( "Adam Turski", address2, new Date() );
		deliveryWS.createDelivery( "Adam Turski", address );
		deliveryWS.createDelivery( "Ilona Turska", address2 );
	}
}
