package com.kalesha.boot.service;

import com.kalesha.boot.model.User;
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