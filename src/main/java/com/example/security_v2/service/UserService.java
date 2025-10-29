package com.example.security_v2.service;

import com.example.security_v2.model.User;
import com.example.security_v2.repository.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepo repo;

    public User createUser(User user) {
        return repo.save(user);
    }
}
