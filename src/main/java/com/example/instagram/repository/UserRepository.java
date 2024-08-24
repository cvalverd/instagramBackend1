package com.example.instagram.repository;

import java.util.ArrayList;
import java.util.List;

import com.example.instagram.model.ProfileInfo;
import com.example.instagram.model.User;

public class UserRepository {
    
    private final List<User> users = new ArrayList<>();

    public List<User> findAll() {
        return users;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public User findUserById(String id) {
        for (User user : users) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
    return null;
    }

public void updateUser(String id, User updateUser) {
    for (int i = 0; i < users.size(); i++) {
        if (users.get(i).getId().equals(id)) {
            users.set(i, updateUser);
            return;
        }
    }
}

public void deleteUser(String id) {
    for (int i = 0; i < users.size(); i++) {
        if (users.get(i).getId().equals(id)) {
            users.remove(i);
            return;
        }
    }
}

    public UserRepository() {
        // Inicializar la listas con usuarios
        users.add(new User("1","pepe.frog","password123","pepe@frog.com","Pepe the Frog","1900-01-01",
            new ProfileInfo("Internet Meme",
                            "Rana legendaria","/img/feed/profile_feed.png","1,234","5,678","9,101")));

        users.add(new User("2","grumpy.cat","password456","grumpy@cat.com","Grumpy Cat","2012-04-04",
            new ProfileInfo("El gato enojon",
                            "Gato legendario","/img/feed/grumpy_feed.png","2,345","8,123","7,890")));                        

    }
}