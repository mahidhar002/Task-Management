package com.Jyoshna.task.user.service.service;

import com.Jyoshna.task.user.service.model.User;

import java.util.List;

public interface UserService {
    public User getUserProfile (String jwt);
    public List<User> getAllUsers();
    void deleteUserById(Long id) throws Exception;


}
