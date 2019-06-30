package com.example.demo;

//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//public class HelloController {
//    @RequestMapping("/hello")
//    public String say(){
//        return "Hello My Demo Spring boot";
//    }
//}
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //采用注解的方式定义该类为处理请求的Controller类；
//用于定义一个请求映射，value为请求的url，method用以指定该请求类型，一般为get和post，代码中要调用printHello方法，即可访问 hello/hello
@RequestMapping(value = "/", method = RequestMethod.GET)
public class HelloController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String printHello() {
        return "hello";
    }
}


