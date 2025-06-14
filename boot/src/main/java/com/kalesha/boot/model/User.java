package com.kalesha.boot.model;

<<<<<<< HEAD
=======
<<<<<<< HEAD
public class User {
    private Long id;
    private String name;
    private String email;

=======
>>>>>>> f21b84393fe6dea1f58e6958576a440afd22400d
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
=======
>>>>>>> f1f52ed (Initial commit of Spring Boot project with CRUD functionality)
>>>>>>> f21b84393fe6dea1f58e6958576a440afd22400d
    // Getters and setters
    public Long getId() {
        return id;
    }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> f21b84393fe6dea1f58e6958576a440afd22400d
    public void setId(Long id) {
        this.id = id;
    }

<<<<<<< HEAD
=======
=======
>>>>>>> f1f52ed (Initial commit of Spring Boot project with CRUD functionality)
>>>>>>> f21b84393fe6dea1f58e6958576a440afd22400d
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
<<<<<<< HEAD
}
=======
}
>>>>>>> f1f52ed (Initial commit of Spring Boot project with CRUD functionality)
>>>>>>> f21b84393fe6dea1f58e6958576a440afd22400d
