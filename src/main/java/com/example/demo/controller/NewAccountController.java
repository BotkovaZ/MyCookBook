package com.example.demo.controller;

import com.example.demo.model.user.User;
import com.example.demo.model.user.UsersProvider;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/new_account")
public class NewAccountController {

//    @GetMapping("/new_account")
    @RequestMapping(value = "/new_account", method = RequestMethod.GET)
    public String newAccount() {

        return "new_account";
    }

    @PostMapping("")
    public String createNewAccount(User user) {
        UsersProvider.addUser(user);

        return "index";
    }
}
