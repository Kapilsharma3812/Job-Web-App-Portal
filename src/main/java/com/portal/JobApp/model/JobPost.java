package com.portal.JobApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Data //(For getters & Setters)
@NoArgsConstructor //(for default Constructor)
@AllArgsConstructor //(Its a constructor will take all the  parameters)
@Component
public class JobPost {

    private int postId;
    private String postProfile;
    private String postDesc;
    private int reqExperience;
    private List<String> postTechStack;
}
