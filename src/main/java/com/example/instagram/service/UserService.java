package com.example.instagram.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.example.instagram.model.User;

@Service
public interface UserService {
    
    List<User> getAllUsers();
    void createUser(User user);
    User getUserById(String id);
    void updateUser(String id, User user);
    void deleteUser(String id);

}
