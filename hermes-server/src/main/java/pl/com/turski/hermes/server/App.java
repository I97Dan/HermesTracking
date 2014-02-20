package pl.com.turski.hermes.server;


import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import pl.com.turski.hermes.server.model.Address;
import pl.com.turski.hermes.server.service.ShipmentService;

/**
 * Populate database
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
        applicationContext.setConfigLocation("applicationContext.xml");
        ShipmentService shipmentService = (ShipmentService) applicationContext.getBean("shipmentService");
        applicationContext.refresh();

        shipmentService.registerShipment("Adam Turski", new Address("Zalesie", "88A", "", "21400", "Łuków", "PL"));
        shipmentService.registerShipment("Ilona Turska", new Address("Zalesie", "88A", "", "21400", "Łuków", "PL"));
        shipmentService.registerShipment("ENIGMA SOI Sp. z o.o.", new Address("Zalesie", "88A", "", "21400", "Łuków", "PL"));
        shipmentService.registerShipment("SEDKOMP Sp. jawna Sawicki, Sikora", new Address("Zalesie", "88A", "", "21400", "Łuków", "PL"));
        shipmentService.registerShipment("Biedronka, Sklep nr.53", new Address("Zalesie", "88A", "", "21400", "Łuków", "PL"));

    }
}
