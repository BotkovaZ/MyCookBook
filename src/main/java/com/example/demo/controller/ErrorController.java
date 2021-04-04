package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/403")
public class ErrorController {

    @GetMapping("")
    public String getErrorMessage() {
        return "error";
    }

    @GetMapping("/index")
    public String logIn() {
        return "index";
    }

    @GetMapping("/new_account")
    public String createAccount() {
        return "new_account";
    }
}
