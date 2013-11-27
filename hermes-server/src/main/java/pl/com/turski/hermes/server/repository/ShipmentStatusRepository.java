package pl.com.turski.hermes.server.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import pl.com.turski.hermes.server.model.ShipmentStatus;

/**
 * User: Adam
 */
public interface ShipmentStatusRepository extends PagingAndSortingRepository<ShipmentStatus, Long>
{}
