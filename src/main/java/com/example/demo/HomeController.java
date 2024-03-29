package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @RequestMapping(value="/home",method = RequestMethod.GET)
    @ResponseBody
    public String home(){
        System.out.println("redirect to home page!");
        return "index";
    }

    @RequestMapping(value = "/home/page",method = RequestMethod.GET)
    @ResponseBody
    public String goHome() {
        System.out.println("go to the home page!");
        ModelAndView mode = new ModelAndView();
        mode.addObject("name", "zhangsan");
        mode.setViewName("index");
        return "mode";
    }
}
