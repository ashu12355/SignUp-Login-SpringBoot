package com.ashu.signup.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashu.signup.model.User;
import com.ashu.signup.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void saveUser(User user){
        userRepository.save(user);
    }


    public boolean validateUser(String username , String password){
        User user = userRepository.findByUsername(username);
        return user != null && user.getPassword().equals(password);
    }  
}
