package com.example.Book_My_Show.Controller;

import com.example.Book_My_Show.Dtos.UserRequestDto;
import com.example.Book_My_Show.ServiceLayer.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/create-user")
    public String createUser(UserRequestDto userRequestDto){
        return userService.createUser(userRequestDto);
    }
}
