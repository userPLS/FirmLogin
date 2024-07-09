package org.example.login.controller;


import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpSession;
import org.example.login.pojo.Person;
import org.example.login.service.userService;
import org.example.login.tools.PasswordEncoder;
import org.example.login.tools.TokenProvider;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class userController{

    @Resource
    userService userservice;


    @GetMapping("/login")
    public String login() {
        return "user/login";
    }


    @PostMapping("/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password ,HttpSession session) {
        if (PasswordEncoder.PasswordEncoder.matches(password, USER.get(username))) {
            // 模拟一个用户的数据 用户id为1  登录端为网页web  角色是admin
            return TokenProvider.createToken("1", "web", "admin");
        }
        return "error";
    }
}
