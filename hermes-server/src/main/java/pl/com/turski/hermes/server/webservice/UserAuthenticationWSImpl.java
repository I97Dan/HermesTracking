package pl.com.turski.hermes.server.webservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import pl.com.turski.hermes.server.model.UserAuthentication;
import pl.com.turski.hermes.server.service.UserAuthenticationService;

import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * User: Adam
 */
@WebService(endpointInterface = "pl.com.turski.hermes.server.webservice.UserAuthenticationWS", serviceName = "userAuthenticationWS")
public class UserAuthenticationWSImpl implements UserAuthenticationWS {

    @Autowired
    private UserAuthenticationService userAuthenticationService;

    @Override
    @Transactional
    public UserAuthentication getUserAuthentication(@WebParam(name = "login") String login, @WebParam(name = "password") String password) {
        return userAuthenticationService.getUserAuthentication(login, password);
    }
}
