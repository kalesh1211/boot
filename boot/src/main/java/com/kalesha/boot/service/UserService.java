package com.kalesha.boot.service;

import com.kalesha.boot.model.User;
<<<<<<< HEAD
=======
<<<<<<< HEAD
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserService {
    public List<User> getAllUsers() {
        return Arrays.asList(
            createUser(1L, "Kalesha", "kalesha@example.com"),
            createUser(2L, "John", "john@example.com")
        );
    }

    private User createUser(Long id, String name, String email) {
        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setEmail(email);
        return user;
    }
}
=======
>>>>>>> f21b84393fe6dea1f58e6958576a440afd22400d
import com.kalesha.boot.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

<<<<<<< HEAD
    // CRUD Operations
=======
>>>>>>> f21b84393fe6dea1f58e6958576a440afd22400d
    public User createUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public User updateUser(Long id, User updatedUser) {
<<<<<<< HEAD
        return userRepository.findById(id)
                .map(user -> {
                    user.setName(updatedUser.getName());
                    user.setEmail(updatedUser.getEmail());
                    return userRepository.save(user);
                })
                .orElse(null);
=======
        return userRepository.findById(id).map(user -> {
            user.setName(updatedUser.getName());
            user.setEmail(updatedUser.getEmail());
            return userRepository.save(user);
        }).orElse(null);
>>>>>>> f21b84393fe6dea1f58e6958576a440afd22400d
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
<<<<<<< HEAD


    private User createUser(Long id, String name, String email) {
        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setEmail(email);
        return user;
    }
}
=======
}
>>>>>>> f1f52ed (Initial commit of Spring Boot project with CRUD functionality)
>>>>>>> f21b84393fe6dea1f58e6958576a440afd22400d
