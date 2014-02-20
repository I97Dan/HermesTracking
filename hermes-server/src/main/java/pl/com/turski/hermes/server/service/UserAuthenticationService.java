package pl.com.turski.hermes.server.service;

import org.springframework.stereotype.Service;
import pl.com.turski.hermes.server.model.UserAuthentication;

/**
 * User: Adam
 */
@Service
public interface UserAuthenticationService {
    public UserAuthentication getUserAuthentication(String login, String password);
}
