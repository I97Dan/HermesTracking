package pl.com.turski.hermes.server.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import pl.com.turski.hermes.server.model.UserApp;

/**
 * User: Adam
 */
public interface UserAppRepository extends PagingAndSortingRepository<UserApp, Long> {
}
