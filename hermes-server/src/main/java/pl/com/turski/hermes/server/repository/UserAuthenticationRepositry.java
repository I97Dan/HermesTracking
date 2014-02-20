package pl.com.turski.hermes.server.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import pl.com.turski.hermes.server.model.UserAuthentication;

/**
 * User: Adam
 */
public interface UserAuthenticationRepositry extends PagingAndSortingRepository<UserAuthentication, Long> {
    UserAuthentication findByLoginAndPassword(String login, String password);
}
