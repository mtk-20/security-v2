package com.example.security_v2.service;

import com.example.security_v2.model.User;
import com.example.security_v2.model.UserPrincipal;
import com.example.security_v2.repository.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepo repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = repo.findByUsername(username);
        if (user == null) {
            System.out.println("404");
            throw new UsernameNotFoundException("Username Not Found.");
        }

        return new UserPrincipal(user);
    }
}
