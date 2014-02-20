package pl.com.turski.hermes.server.model;

import javax.persistence.*;

/**
 * User: Adam
 */
@Entity
public class UserApp {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "userapp_gen")
    @SequenceGenerator(initialValue = 1, name = "userapp_gen", sequenceName = "userapp_seq")
    private Long id;
    private String name;
    private String surname;

    public UserApp() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
