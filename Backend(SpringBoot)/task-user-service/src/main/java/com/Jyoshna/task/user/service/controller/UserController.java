package com.Jyoshna.task.user.service.controller;

import com.Jyoshna.task.user.service.config.JwtConstant;
import com.Jyoshna.task.user.service.model.User;
import com.Jyoshna.task.user.service.service.UserService;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import jdk.jshell.spi.ExecutionControl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/profile")
    public ResponseEntity<User> getUserProfile(
            @RequestHeader("Authorization") String jwt){

        User user = userService.getUserProfile(jwt);
        return new ResponseEntity<>(user, HttpStatus.ACCEPTED);
    }
    @GetMapping
    public ResponseEntity<List<User>> getUsers(@RequestHeader("Authorization") String jwt) {
        List<User> user = userService.getAllUsers();
        return new ResponseEntity<>(user, HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUserById(
            @PathVariable Long id,
            @RequestHeader("Authorization") String jwt) {
        try {
            userService.deleteUserById(id);
            return new ResponseEntity<>("User deleted successfully.", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

}
