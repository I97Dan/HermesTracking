package pl.com.turski.hermes.server.webservice;

import pl.com.turski.hermes.server.model.UserAuthentication;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * User: Adam
 */
@WebService
public interface UserAuthenticationWS {

    @WebMethod
    public UserAuthentication getUserAuthentication(@WebParam(name = "login") String login, @WebParam(name = "password") String password);
}
