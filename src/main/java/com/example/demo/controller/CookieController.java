package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/cookie")
public class CookieController {

    @GetMapping(path = "")
    public String getCookie(HttpServletRequest req, HttpServletResponse response, @CookieValue(value = "counter", defaultValue = "0") int counterValue, @CookieValue(value = "visited", defaultValue = "") String visitedValues, Model model) {

        String[] items = visitedValues.split(",");

        counterValue++;
        Cookie cookie = new Cookie("counter", "" + counterValue);
        Cookie cookie1 = new Cookie("isLoggedIn", "TRUE");
        Cookie cookieVisitedItems = new Cookie("visited", "10, 20, 30, 40");

        cookie.setMaxAge(3600*24*7);
        response.addCookie(cookie);
        response.addCookie(cookie1);
        response.addCookie(cookieVisitedItems);

        model.addAttribute("nrOfVisits", counterValue);
        return "cookie";
    }
}
