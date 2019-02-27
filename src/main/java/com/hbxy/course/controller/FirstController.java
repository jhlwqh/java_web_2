package com.hbxy.course.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {
    @RequestMapping("/firstController")
    public String test(Model model){
        model.addAttribute("msg","我叫海兰");
        return "/jsp/first";
    }
}
