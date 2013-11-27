package pl.com.turski.hermes.server.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import pl.com.turski.hermes.server.model.Address;

/**
 * User: Adam
 */
public interface AddressRepository extends PagingAndSortingRepository<Address, Long>
{}
