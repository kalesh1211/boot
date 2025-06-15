package com.kalesha.boot.controller;

import com.kalesha.boot.model.User;
import com.kalesha.boot.service.UserService;
<<<<<<< HEAD
=======

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
>>>>>>> 595b5e38512c21fabff9cffb18d055539a5f7525
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
<<<<<<< HEAD
=======

>>>>>>> 595b5e38512c21fabff9cffb18d055539a5f7525
public class HelloController {

    private final UserService userService;

    public HelloController(UserService userService) {
        this.userService = userService;
    }

<<<<<<< HEAD
=======

>>>>>>> 595b5e38512c21fabff9cffb18d055539a5f7525
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
>>>>>>> 595b5e38512c21fabff9cffb18d055539a5f7525
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

}

>>>>>>> 595b5e38512c21fabff9cffb18d055539a5f7525
