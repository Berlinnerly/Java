package com.berlin.controller;

import com.berlin.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Berlin
 * @date 2021/2/4 11:14
 * @description
 */

@RequestMapping("hello")
@Controller
public class RequestData {

    // 测试请求参数和请求头
    @RequestMapping(value = "test", params = {"id", "!username", "age != 1"})
    public String test() {
        return "success";
    }

    // 访问主页
    @RequestMapping({"/", "/index.html"})
    public String index() {
        return "index";
    }

    //测试Ant风格路径风格
    @RequestMapping("/**/user")
    public String testAnt() {
        return "success";
    }

    @RequestMapping("/*/name")
    public String testAnt2() {
        return "success";
    }

    @RequestMapping("/?/id")
    public String testAnt3() {
        return "success";
    }

    // 测试映射请求占位符
    @RequestMapping("/test/{id}/{name}")
    public String testVar(@PathVariable("id") Integer id, @PathVariable("name") String name) {
        System.out.println(id);
        System.out.println(name);
        return "success";
    }

    // 测试Rest风格请求
    @RequestMapping(value = "testget/{id}", method = RequestMethod.GET)
    public String testget(@PathVariable(value = "id") String id) {
        System.out.println(id);
        return "success";
    }

    @RequestMapping(value = "testpost", method = RequestMethod.POST)
    public String testpost() {
        return "success";
    }

    @RequestMapping(value = "testput/{id}", method = RequestMethod.PUT)
    public String tesetput(@PathVariable("id") Integer id) {
        System.out.println(id);
        return "success";
    }

    @RequestMapping(value = "testdelete/{id}", method = RequestMethod.DELETE)
    public String testdelete(@PathVariable("id") Integer id) {
        System.out.println(id);
        return "success";
    }

    // 测试@RequsetParam注解
    @RequestMapping("testrequestparam")
    public String testCookies(@RequestParam("username") String username,
                              @RequestParam(value = "age", required = false, defaultValue = "0") Integer age) {
        System.out.println(username);
        System.out.println(age);
        return "success";
    }

    // 测试@RequestHeader注解
    @RequestMapping("testrequestheader")
    public String testrequestheader(@RequestHeader("Accept-Language") String al) {
        System.out.println(al);
        return "success";
    }

    // 测试CookieValue注解
    @RequestMapping("testcookievalue")
    public String testcookievalue(@CookieValue("JSESSIONID") String sessionid) {
        System.out.println(sessionid);
        return "success";
    }

    // 使用原始的Java对象（POJO）作为参数
    @RequestMapping(value = "testpojo", method = RequestMethod.POST)
    public String testpojo(User user) {
        System.out.println(user);
        return "success";
    }

    // 使用Servlet原生API
    @RequestMapping("testservletapi")
    public String testservletapi(HttpServletRequest request, HttpResponse response) {
        System.out.println("testservletapi" + request + "," + response);
        return "success";
    }
}
