package com.hbxy.course.interceptor;

import com.hbxy.course.login.model.UserLogin;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginInterceptor implements HandlerInterceptor {
    private static final String[] IGNORE_URI={"/login/login"};
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,Object o) throws ServletException, IOException {
        boolean flag = false;
        String url = request.getServletPath();
        for(String s: IGNORE_URI){
            if(url.contains(s)){
                flag = true;
                break;
            }
        }
        if(!flag){
           UserLogin userLogin = (UserLogin)request.getSession().getAttribute("USER_SESSION");
           if(userLogin==null){
               request.setAttribute("message","请先登录");
               request.getRequestDispatcher("/jsp/login/login.jsp").forward(request,response);
           }else{
               flag=true;
           }

        }
        return flag;
    }
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object o, ModelAndView modelAndView )throws Exception{


    }

    @Override
    public void afterCompletion(HttpServletRequest request,HttpServletResponse response,Object o,Exception e)throws Exception{

    }

}
