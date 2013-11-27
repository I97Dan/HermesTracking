package pl.com.turski.hermes.server.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import pl.com.turski.hermes.server.model.Shipment;

/**
 * User: Adam
 */
public interface ShipmentRepository extends PagingAndSortingRepository<Shipment, Long>
{}
