package com.kalesha.boot.model;
<<<<<<< HEAD

=======
public class User {
    private Long id;
    private String name;
    private String email;
>>>>>>> 595b5e38512c21fabff9cffb18d055539a5f7525
import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;

    public User() {}

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

<<<<<<< HEAD
    // Getters and setters
=======
>>>>>>> 595b5e38512c21fabff9cffb18d055539a5f7525
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
<<<<<<< HEAD
}
=======

}

}

}
>>>>>>> 595b5e38512c21fabff9cffb18d055539a5f7525
