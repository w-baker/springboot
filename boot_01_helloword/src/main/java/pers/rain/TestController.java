package pers.rain;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: W-CH
 * @Time: 2022-11-23 09:29
 * @E-mail: wang.xiaohong.0817@gmail.com
 * @Software: IntelliJ IDEA
 */
@RestController
public class TestController {
    
    @RequestMapping("/test")
    public String test(){
        return "test";
    }
}
