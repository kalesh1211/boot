package com.kalesha.boot.controller;

import com.kalesha.boot.model.User;
import com.kalesha.boot.service.UserService;
<<<<<<< HEAD
=======
<<<<<<< HEAD
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
=======
>>>>>>> f21b84393fe6dea1f58e6958576a440afd22400d
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
<<<<<<< HEAD
=======
>>>>>>> f1f52ed (Initial commit of Spring Boot project with CRUD functionality)
>>>>>>> f21b84393fe6dea1f58e6958576a440afd22400d
public class HelloController {

    private final UserService userService;

    public HelloController(UserService userService) {
        this.userService = userService;
    }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> f21b84393fe6dea1f58e6958576a440afd22400d
    @GetMapping("/")
    public String hello() {
        return "Hello, Kalesha!";
    }

<<<<<<< HEAD
=======
    @GetMapping("/users")
    public List<User> getUsers() {
        return userService.getAllUsers();
    }
}
=======
>>>>>>> f21b84393fe6dea1f58e6958576a440afd22400d
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.getUserById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user) {
        return userService.updateUser(id, user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> f1f52ed (Initial commit of Spring Boot project with CRUD functionality)
>>>>>>> f21b84393fe6dea1f58e6958576a440afd22400d
