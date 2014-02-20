package pl.com.turski.hermes.server.service;

import com.google.common.collect.Lists;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import pl.com.turski.hermes.server.model.Address;
import pl.com.turski.hermes.server.model.Shipment;
import pl.com.turski.hermes.server.repository.ShipmentRepository;

import java.util.Date;
import java.util.List;

/**
 * User: Adam
 */
@Component
public class ShipmentServiceImpl implements ShipmentService {
    private static final Logger LOG = Logger.getLogger(ShipmentServiceImpl.class);

    @Autowired
    private ShipmentRepository shipmentRepository;

    @Override
    public List<Shipment> shipmentList() {
        LOG.debug("Getting shipment list");
        Iterable<Shipment> shipmentIterable = shipmentRepository.findAll();
        List<Shipment> shipmentList = Lists.newArrayList(shipmentIterable);
        LOG.info("Fetched " + shipmentList.size() + " shipments.");
        return shipmentList;
    }

    @Override
    @Transactional
    public Long registerShipment(String recipient, Address recipientAddress) {
        LOG.info("START registerShipment for: recipient=" + recipient + "|recipientAddress=" + recipientAddress);
        Shipment shipment = new Shipment(recipient, recipientAddress, new Date());
        Shipment createdShipment = shipmentRepository.save(shipment);
        LOG.info("END registerShipment with: createdShipment.id=" + createdShipment.getId());
        return createdShipment.getId();
    }

    @Override
    @Transactional
    public Shipment checkShipment(Long shipmentId) {
        LOG.info("START checkShipment for: shipmentId=" + shipmentId);
        Shipment shipment = shipmentRepository.findOne(shipmentId);
        if (shipment == null) {
            return null;
        }

        LOG.info("END checkShipment with: shipment.id=" + shipment.getId());
        return shipment;
    }

}
