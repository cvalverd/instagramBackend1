package com.example.instagram.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class User {
    private String id;
    private String username;
    private String password;
    private String email;
    private String name;
    private String birthdate;
    private ProfileInfo profileinto;
}
