package com.lhx.controller;

import com.lhx.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by xin on 15-1-11 下午5:14
 *
 * @project springmvc
 * @package com.lhx.controller
 * @Description
 * @blog http://blog.csdn.net/u011439289
 * @email 888xin@sina.com
 * @github https://github.com/888xin
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/login")
    public String login(HttpServletRequest request, HttpServletResponse response){
        System.out.println("-----登陆验证-----");
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        Cookie cookie = new Cookie("user", userName + "-" + password) ;
        cookie.setMaxAge(1*60*60*24*7);
        response.addCookie(cookie);
        User currentUser = new User(userName, password);
        HttpSession session = request.getSession() ;
        session.setAttribute("currentUser", currentUser);
        return "redirect:/main.jsp" ;
    }

    @RequestMapping("/login2")
    public String login2(HttpServletRequest request){
        return "redirect:/main.jsp" ;
    }

    @RequestMapping("/login3")
    public String login3(HttpSession session){
        return "redirect:/main.jsp" ;
    }

    @RequestMapping("/ajax")
    public @ResponseBody User ajax(){
        User user = new User("zhangsan", "123") ;
        return user ;
    }
}
