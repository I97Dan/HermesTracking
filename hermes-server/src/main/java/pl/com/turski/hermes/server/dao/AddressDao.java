package pl.com.turski.hermes.server.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import pl.com.turski.hermes.server.model.Address;

/**
 * User: Adam
 */
public interface AddressDao extends PagingAndSortingRepository<Address, Long>
{}
