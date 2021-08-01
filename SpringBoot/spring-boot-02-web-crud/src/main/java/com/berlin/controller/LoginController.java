package com.berlin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author Berlin
 * @date 2021/2/2 17:46
 * @description
 */

@Controller
public class LoginController {
    @PostMapping("/user/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Map<String, Object> map, HttpSession session) {
        if (!StringUtils.isEmpty(username) && "123456".equals(password)) {
            // 登录成功，为了防止表单重复提交，可以使用重定向
            session.setAttribute("loginUser", username);
            return "redirect:/main.html";
        } else {
            // 登录失败
            map.put("msg", "用户名密码错误");
            return "login";
        }
    }
}
