package com.example.demo.controller;

import com.example.demo.model.user.User;
import com.example.demo.model.user.UsersProvider;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;

@Controller
//@RequestMapping("/index")
public class IndexController {

//    @PostMapping("/home")
    @RequestMapping(value = "/home", method = RequestMethod.POST)
    public String postLogin(@ModelAttribute("User")User user, Model model, HttpServletResponse response,
                        @CookieValue(value = "visitCounter", defaultValue = "0") int visits, HttpSession session) {

        for (User u: UsersProvider.getUsers()) {
            if (user.getName().equals(u.getName()) && user.getPassword().equals(u.getPassword())) {
                session.setAttribute("name", user.getName());
//                session.setAttribute("password", user.getPassword());
                return "home";
            }
            else {
                model.addAttribute("errormessage", "Username or password is not valid.");
                return "error";
            }
        }

        visits++;

        Cookie cookie = new Cookie("visitCounter", "" + visits);
        cookie.setMaxAge(3600*24*7);
        response.addCookie(cookie);

        model.addAttribute("visitCounter", visits);

        return "error";
    }

    @PostMapping("/logout")
    public String postLogout(HttpSession session) {
        session.setAttribute("name", "");

        return "index";
    }

    @GetMapping("/new_account")
    public String makeNewAccount() {
        return "new_account";
    }
}


















