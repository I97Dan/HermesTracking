package pl.com.turski.hermes.server.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import pl.com.turski.hermes.server.model.Location;

/**
 * User: Adam
 */
public interface LocationRepository extends PagingAndSortingRepository<Location, Long> {
}
