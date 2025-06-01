package com.Jyoshna.task.user.service.service;

import com.Jyoshna.task.user.service.config.JwtProvider;
import com.Jyoshna.task.user.service.model.User;
import com.Jyoshna.task.user.service.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImplementation implements UserService{

    @Autowired
    private UserRepository userRepository;
    @Override
    public User getUserProfile(String jwt) {
        String email= JwtProvider.getEmailFromJwtToken(jwt);
        return userRepository.findByEmail(email);
    }
    @Override
    public void deleteUserById(Long id) throws Exception {
        User user = userRepository.findById(id).orElse(null);
        if (user == null) {
            throw new Exception("User not found");
        }
        userRepository.deleteById(id);
    }
    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
