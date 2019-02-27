package com.hbxy.course.login.controller;

import com.hbxy.course.login.model.UserLogin;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    @RequestMapping(value = "/lo                                                                                                                     gin/login",method = RequestMethod.GET)
    public String toLogin(){
        return "/jsp/login/login";
    }
    @RequestMapping(value = "login/login",method = RequestMethod.POST)
    public String login(UserLogin user, Model model, HttpSession session){
        String userLoginId = user.getUserLoginId();
        String passward = user.getCurrentPassword();
        if(userLoginId!=null&&userLoginId.equals("admin")&&passward!=null&&passward.equals("123")){
            session.setAttribute("USER_SESSION",user);
            return "redirect:home";

        }
        model.addAttribute("message","用户名或者密码错误");
        return "/jsp/login/login";
    }
    @RequestMapping("/login/home")
    public String toHome(){
        return "/jsp/login/home";
    }
    @RequestMapping("/logout")
    public String logout(HttpSession session){
        return "jsp/login/login";
    }
}
