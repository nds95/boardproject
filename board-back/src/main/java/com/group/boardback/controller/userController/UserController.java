package com.group.boardback.controller.userController;

import com.group.boardback.dto.getUser.GetUserRequest;
import com.group.boardback.dto.saveUser.SaveUserRequest;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class UserController {
    public UserController() {
    }

    @GetMapping("/user")
    public HashMap<String, String> getUser(@RequestParam GetUserRequest request){
        System.out.println(request.getName());
        HashMap<String, String> userMap = new HashMap<String, String>();
        userMap.put("name", request.getName());
        return userMap;
    }

    @PostMapping("/signup")
    public HashMap<String, String> saveUser(@RequestBody SaveUserRequest request){
        System.out.println(request.getName());
        HashMap<String, String> userMap = new HashMap<String, String>();
        userMap.put("name", request.getName());
        return userMap;
    }
}
