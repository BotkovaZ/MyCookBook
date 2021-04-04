package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

@Controller
@RequestMapping("/session")
public class SessionController {

    @PostMapping("/add")
    @ResponseBody
    public String addToSession(@RequestBody String text, HttpServletRequest req) {
        ArrayList<String> list = (ArrayList<String>)req.getSession().getAttribute("list");
        if (list == null)
            list = new ArrayList<>();

        list.add(text);
        req.getSession().setAttribute("list", list);

        return "Added given body to list in session. \n " + listToString(list);
    }

    @GetMapping("/list")
    @ResponseBody
    public String getList(HttpServletRequest request) {
        ArrayList<String> list = (ArrayList<String>) request.getSession().getAttribute("list");
        return listToString(list);
    }

    public String listToString(ArrayList<String> list) {
        if (list == null) {
            return "List is empty.";
        } else {
            String retVal = "Current list: \n";
            for (String s: list)
                retVal += s + "\n";
            return retVal;
        }
    }
}
