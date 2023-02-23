package com.group.boardproject.controller.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    public UserController() {
    }

    @GetMapping("/user")
    public String getUser(String user) {
        if(!user.equals("zz")) {
            throw new IllegalArgumentException("user 값이 올바르지 않음");
        }
        return "hello";
    }
}
