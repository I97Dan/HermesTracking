package pl.com.turski.hermes.server.service;

import org.springframework.stereotype.Service;
import pl.com.turski.hermes.server.model.ShipmentMovement;

import java.util.List;

/**
 * User: Adam
 */
@Service
public interface ShipmentMovementService {
    public List<ShipmentMovement> shipmentMovementList(Long shipmentId);
}
