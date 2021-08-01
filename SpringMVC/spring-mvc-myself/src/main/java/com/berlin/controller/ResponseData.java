package com.berlin.controller;

import com.berlin.bean.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * @author Berlin
 * @date 2021/2/5 10:13
 * @description
 */
@Controller
public class ResponseData {

    /**
     * 使用ModelAndView处理响应数据
     *
     * @return
     */
    @RequestMapping("testmodelandview")
    public ModelAndView testModelAndView() {
        ModelAndView modelAndView = new ModelAndView();
        // 向作用域中放值
        modelAndView.addObject("username", "root");
        // 设置视图名称
        modelAndView.setViewName("success");
        System.out.println("testmodelandview");
        return modelAndView;
    }

    /**
     * 使用Map处理响应数据（推荐使用，便于框架移植）
     *
     * @return
     */
    @RequestMapping("testmap")
    public String testMap(Map<String, Object> map) {
        map.put("username", "root");
        System.out.println(map);
        return "success";
    }

    /**
     * 使用Model处理响应数据
     *
     * @param model
     * @return
     */
    @RequestMapping("testmodel")
    public String testModel(Model model) {
        model.addAttribute("username", "admin");
        return "success";
    }

//    /**
//     * 测试重定向页面
//     *
//     * @return
//     */
//    @RequestMapping("testredirect")
//    public String testRedirect() {
//        return "forward:success";
//    }

    /**
     * SpringMVC处理Json的四个条件
     * 1. 导入Jackson的jar
     * 2. 在SpringMVC的配置文件中开启MVC驱动，<mvc:annotation-driven />
     * 3. 在处理Ajax请求的方法上加上注解@ResponseBody
     * 4. 将要转换为Json且相应到客户端的数据，直接作为该方法的返回值返回
     *
     * @return
     * @ResponseBody 将整个方法作为响应体，不会实现页面跳转
     */
    @ResponseBody
    @RequestMapping("testjson")
    public Person testjson() {
        Person person = new Person("Berlin", 18, "男");
        return person;
    }
}
