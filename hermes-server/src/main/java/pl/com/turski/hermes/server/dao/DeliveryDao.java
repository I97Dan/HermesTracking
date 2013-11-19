package pl.com.turski.hermes.server.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import pl.com.turski.hermes.server.model.Delivery;

/**
 * User: Adam
 */
public interface DeliveryDao extends PagingAndSortingRepository<Delivery, Long>
{}
