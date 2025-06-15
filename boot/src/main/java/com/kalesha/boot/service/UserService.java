package com.kalesha.boot.service;

import com.kalesha.boot.model.User;
<<<<<<< HEAD
=======

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

>>>>>>> 595b5e38512c21fabff9cffb18d055539a5f7525
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

    // CRUD Operations
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
=======

>>>>>>> 595b5e38512c21fabff9cffb18d055539a5f7525
        return userRepository.findById(id)
                .map(user -> {
                    user.setName(updatedUser.getName());
                    user.setEmail(updatedUser.getEmail());
                    return userRepository.save(user);
                })
                .orElse(null);
<<<<<<< HEAD
=======

        return userRepository.findById(id).map(user -> {
            user.setName(updatedUser.getName());
            user.setEmail(updatedUser.getEmail());
            return userRepository.save(user);
        }).orElse(null);

>>>>>>> 595b5e38512c21fabff9cffb18d055539a5f7525
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }


    private User createUser(Long id, String name, String email) {
        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setEmail(email);
        return user;
    }
<<<<<<< HEAD
}
=======
}

}

>>>>>>> 595b5e38512c21fabff9cffb18d055539a5f7525
