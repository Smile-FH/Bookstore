package com.fh.bookstore.controller;

import com.fh.bookstore.entity.User;
import com.fh.bookstore.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author HueFu
 * @version 0.0.1
 * @date 2020-12-11 17:24
 */
@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/show")
    public String showUser(){
        User user = userService.selectByPrimaryKey(1);
        System.out.println(user.toString());
        return "the web is success";
    }
}
