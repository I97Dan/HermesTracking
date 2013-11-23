package pl.com.turski.hermes.server.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import pl.com.turski.hermes.server.model.Shipment;

/**
 * User: Adam
 */
public interface ShipmentDao extends PagingAndSortingRepository<Shipment, Long>
{}
