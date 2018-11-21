    package com.ygm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by admin on 2018/11/13.
 * spring mvc hello例子
 */
@Controller
public class HelloController {
    @RequestMapping(value="/hello", method = RequestMethod.GET )
    @ResponseBody
    public String printHello(Model model){
        model.addAttribute("message","Hello Spring MVC Framework！");
        return "hello";
    }
    /**
     * org.springframework.web.bind.annotation.RequestMapping注解
     * 用来映射请求的的URL和请求的方法等。本例用来映射"/hello"
     * hello只是一个普通方法。
     * 该方法返回一个包含视图路径或视图路径和模型的ModelAndView对象。
     * */
    @RequestMapping(path="/hello1")
    @ResponseBody
    public ModelAndView hello(){
        // 创建准备返回的ModelAndView对象，该对象通常包含了返回视图的路径、模型的名称以及模型对象
        ModelAndView mv = new ModelAndView();
        //添加模型数据 可以是任意的POJO对象
        mv.addObject("message", "你好，Hello World!");
        // 设置逻辑视图名，视图解析器会根据该名字解析到具体的视图页面
        mv.setViewName("index");
        // 返回ModelAndView对象。
        return mv;
    }
    @RequestMapping(path="/home")
    @ResponseBody
    public ModelAndView home(){
        // 创建准备返回的ModelAndView对象，该对象通常包含了返回视图的路径、模型的名称以及模型对象
        ModelAndView mv = new ModelAndView();
        //添加模型数据 可以是任意的POJO对象
        mv.addObject("message", "home,这是我的家！");
        // 设置逻辑视图名，视图解析器会根据该名字解析到具体的视图页面
        mv.setViewName("home");
        // 返回ModelAndView对象。
        return mv;
    }

    @RequestMapping("/hello2")
    public String hello2(Model model) {
        model.addAttribute("greeting", "Hello Spring MVC");
        return"helloworld";
    }


}
