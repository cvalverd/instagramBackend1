package com.example.instagram.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.instagram.model.User;
import com.example.instagram.service.UserService;

import lombok.RequiredArgsConstructor;




@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {
    
    private final UserService userService;
    
    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = userService.getAllUsers();
        if (users.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(users);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable String id) {
        User user = userService.getUserById(id);
        if (user == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(user);
    }
    
    @PostMapping
    public ResponseEntity<Void> createUserEntity(@RequestBody User user) {
        userService.createUser(user);
        return ResponseEntity.status(201).build();
               
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<User>  updateUser(@PathVariable String id, @RequestBody User user) {
        if (!id.equals(user.getId()) || userService.getUserById(id).equals(user)  || userService.getUserById(id) == null) 
        {
            return ResponseEntity.badRequest().build();
        }
        userService.updateUser(id, user);
        return ResponseEntity.ok().build();
        
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable String id) {
        if(userService.getUserById(id) == null){
            return ResponseEntity.badRequest().build();
        }
        userService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }

}
