package pers.rain.boot.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.rain.boot.bean.Car;

import javax.websocket.server.PathParam;

/**
 * @Auther: W-CH
 * @Time: 2022-11-22 21:50
 * @E-mail: wang.xiaohong.0817@gmail.com
 * @Software: IntelliJ IDEA
 */
//@Controller
//@ResponseBody
@RestController
@Slf4j
public class HelloController {
    @Autowired
    private Car car;
    
    @RequestMapping("/car")
    public Car getCar(){
        return car;
    }
    
    @RequestMapping("/hello")
    public String handle01(@PathParam("name") String name) {
        log.info("产生请求");
        return "Hello,Spring Boot 2,你好" + name;
    }
    
    @RequestMapping("/hello2")
    public String handle02(@PathParam("name") String name) {
        log.info("产生请求");
        return "Hello" + name;
    }
}
