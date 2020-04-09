package com.mydelka.mydelkaApp.service;


import com.mydelka.mydelkaApp.model.User;
import com.mydelka.mydelkaApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean registerUser(String name, String lastName, String email, String password) {
        userRepository.save(new User(name, lastName,email,password));
        return true;
    }

}
