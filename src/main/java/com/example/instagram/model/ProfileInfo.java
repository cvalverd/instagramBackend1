package com.example.instagram.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data


public class ProfileInfo {

    private String title;
    private String description;
    private String profilePicUrl;
    private String posts;
    private String followers;
    private String following;
    
}
