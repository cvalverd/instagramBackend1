package com.example.instagram.service;

import org.springframework.stereotype.Service;
import com.example.instagram.model.User;
import com.example.instagram.repository.UserRepository;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository = new UserRepository();

    @Override
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    @Override
    public void createUser(User user) {
        userRepository.addUser(user);
    }
    
    @Override
    public User getUserById(String id) {
        return userRepository.findUserById(id);
    }

    @Override
    public void updateUser(String id, User user) {
        userRepository.updateUser(id, user);
    }

    @Override
    public void deleteUser(String id) {
        userRepository.deleteUser(id);
    }

}
