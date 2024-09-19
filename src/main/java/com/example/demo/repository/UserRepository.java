package com.example.demo.repository;

import com.example.demo.authorities.Authorities;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

@Repository
public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {
        if (user == null || user.isEmpty() || password == null || password.isEmpty()) {
            return Collections.emptyList();
        } else if (user.equals("Admin") && password.equals("Admin123")) {
            return List.of(Authorities.READ, Authorities.WRITE, Authorities.DELETE);
        }
        return List.of(Authorities.READ);
    }
}