package pl.com.turski.hermes.server.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.com.turski.hermes.server.model.Shipment;
import pl.com.turski.hermes.server.model.ShipmentMovement;
import pl.com.turski.hermes.server.repository.ShipmentMovementRepository;
import pl.com.turski.hermes.server.repository.ShipmentRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * User: Adam
 */
@Component
public class ShipmentMovementServiceImpl implements ShipmentMovementService {
    private static final Logger LOG = Logger.getLogger(ShipmentMovementServiceImpl.class);

    @Autowired
    private ShipmentMovementRepository shipmentMovementRepository;
    @Autowired
    private ShipmentRepository shipmentRepository;

    @Override
    public List<ShipmentMovement> shipmentMovementList(Long shipmentId) {
        LOG.info("Getting ShipmentMovement list for Shipment[" + shipmentId + "]");
        Shipment shipment = shipmentRepository.findOne(shipmentId);
        if (shipment == null) {
            LOG.debug("There is no Shipment with id=" + shipmentId);
            return new ArrayList<>();
        }

        List<ShipmentMovement> shipmentMovementList = shipmentMovementRepository.findByShipment(shipment);

        if (shipmentMovementList == null) {
            LOG.debug("There are no ShipmentMovements for Shipment[" + shipmentId + "]");
            return new ArrayList<>();
        }
        return shipmentMovementList;
    }
}
