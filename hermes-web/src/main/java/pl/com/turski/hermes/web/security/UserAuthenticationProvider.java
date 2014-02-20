package pl.com.turski.hermes.web.security;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import pl.com.turski.hermes.web.webservice.UserAuthentication;
import pl.com.turski.hermes.web.webservice.UserAuthenticationWS;
import pl.com.turski.hermes.web.webservice.UserRole;

import java.util.ArrayList;
import java.util.List;

/**
 * User: Adam
 */
public class UserAuthenticationProvider implements AuthenticationProvider {

    private final static Logger LOG = Logger.getLogger(UserAuthenticationProvider.class);

    @Autowired
    private UserAuthenticationWS userAuthenticationWS;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {

        String login = (String) authentication.getPrincipal();
        String password = (String) authentication.getCredentials();

        LOG.info("Authenticate user with login=" + login);

        if (login == null || login.isEmpty() || password == null || password.isEmpty()) {
            throw new BadCredentialsException("Nieprawidłowy login lub hasło");
        }

        UserAuthentication userAuthentication = userAuthenticationWS.getUserAuthentication(login, password);
        List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
        for (UserRole userRole : userAuthentication.getRoles()) {
            grantedAuthorities.add(new SimpleGrantedAuthority(userRole.value()));
        }
        UserDetails userDetails = new User(userAuthentication.getLogin(), userAuthentication.getPassword(), grantedAuthorities);

        return new UsernamePasswordAuthenticationToken(userDetails, authentication, grantedAuthorities);
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication);
    }
}
