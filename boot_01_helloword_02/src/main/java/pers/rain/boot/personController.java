package pers.rain.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pers.rain.bean.Person;

/**
 * @Auther: W-CH
 * @Time: 2022-11-24 09:18
 * @E-mail: wang.xiaohong.0817@gmail.com
 * @Software: IntelliJ IDEA
 */
@RestController
public class personController {
    @Autowired
    private Person person;
    
    @RequestMapping("/person")
    public Person persion(){
        return person;
    }
}
