package pl.com.turski.hermes.server.model;

import javax.persistence.*;
import java.util.List;

/**
 * User: Adam
 */
@Entity
public class UserAuthentication {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "userauthentication_gen")
    @SequenceGenerator(initialValue = 1, name = "userauthentication_gen", sequenceName = "userauthentication_seq")
    private Long id;
    private String login;
    private String password;
    @ElementCollection(fetch = FetchType.EAGER, targetClass = UserRole.class)
    @Enumerated(EnumType.STRING)
    private List<UserRole> roles;
    @OneToOne(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    @JoinColumn(name = "userapp_id")
    private UserApp user;

    public UserAuthentication() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<UserRole> getRoles() {
        return roles;
    }

    public void setRoles(List<UserRole> roles) {
        this.roles = roles;
    }

    public UserApp getUser() {
        return user;
    }

    public void setUser(UserApp user) {
        this.user = user;
    }
}
