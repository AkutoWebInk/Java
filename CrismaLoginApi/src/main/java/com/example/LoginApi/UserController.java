package com.example.LoginApi;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/api")
public class UserController {

    @Autowired  
    private UserRespository userRespository;

    Long userId;
    String userName;
    String userUsername;
    String userPassword;
    Integer userAccessLevel;
    String userUserProfilePic;

    @GetMapping("/userById")
    public User getUserById(@RequestParam Long id, @RequestParam String password){

        System.out.println("API CALL FROM Python - Requesting validation - \n"+"ID: "+id+"\n"+"PASSWORD: "+password);
        //get the user info inside the server-db via id
        User dbUserInfo = userRespository.findById(id).orElse(null);
        
        //filter server-api user info 
        if (dbUserInfo != null){
         userId = dbUserInfo.getId();
         userName = dbUserInfo.getName();
         userUsername = dbUserInfo.getUsername();
         userPassword = dbUserInfo.getPassword();
         userAccessLevel = dbUserInfo.getAccessLevel();
         userUserProfilePic = dbUserInfo.getUserpfp();
        }
        return dbUserInfo;
    }

}
