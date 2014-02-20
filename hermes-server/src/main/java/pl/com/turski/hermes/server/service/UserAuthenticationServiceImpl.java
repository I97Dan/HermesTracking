package pl.com.turski.hermes.server.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.com.turski.hermes.server.model.UserAuthentication;
import pl.com.turski.hermes.server.repository.UserAuthenticationRepositry;

/**
 * User: Adam
 */
@Component
public class UserAuthenticationServiceImpl implements UserAuthenticationService {

    private static final Logger LOG = Logger.getLogger(UserAuthenticationServiceImpl.class);

    @Autowired
    private UserAuthenticationRepositry userAuthenticationRepositry;

    @Override
    public UserAuthentication getUserAuthentication(String login, String password) {
        LOG.info("START getUser for login=" + login);
        UserAuthentication userAuthentication = userAuthenticationRepositry.findByLoginAndPassword(login, password);
        LOG.info("END getUser for login=" + login);
        return userAuthentication;
    }
}
