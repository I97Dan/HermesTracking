package pl.com.turski.hermes.server.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import pl.com.turski.hermes.server.model.Shipment;
import pl.com.turski.hermes.server.model.ShipmentMovement;

import java.util.List;

/**
 * User: Adam
 */
public interface ShipmentMovementRepository extends PagingAndSortingRepository<ShipmentMovement, Long> {
    List<ShipmentMovement> findByShipment(Shipment shipment);
}
