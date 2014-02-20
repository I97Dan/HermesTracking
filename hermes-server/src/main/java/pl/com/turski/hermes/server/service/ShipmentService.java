package pl.com.turski.hermes.server.service;

import org.springframework.stereotype.Service;
import pl.com.turski.hermes.server.model.Address;
import pl.com.turski.hermes.server.model.Shipment;

import java.util.List;

/**
 * User: Adam
 */
@Service
public interface ShipmentService {

    public List<Shipment> shipmentList();

    public Long registerShipment(String recipient, Address recipientAddress);

    public Shipment checkShipment(Long shipmentId);

}
