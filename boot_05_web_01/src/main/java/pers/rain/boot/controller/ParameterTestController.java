package pers.rain.boot.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther: W-CH
 * @Time: 2022-11-25 16:44
 * @E-mail: wang.xiaohong.0817@gmail.com
 * @Software: IntelliJ IDEA
 */
@RestController
public class ParameterTestController {
    
    @GetMapping("/car/{id}/{username}")
    public Map<String, Object> getCar(
            @PathVariable("id") Integer id,
            @PathVariable("username") String name,
            @PathVariable Map<String, String> kv,
            @RequestHeader("User-Agent") String ua,
            @RequestHeader Map<String, String> uam,
            @RequestParam("age") Integer age,
            @RequestParam("inters") List<Object> list
    ) {
        Map<String, Object> map = new HashMap<>();
        map.put("id", id);
        map.put("name", name);
        map.put("pv", kv);
        map.put("ua", ua);
        map.put("uam", uam);
        
        map.put("age", age);
        map.put("list", list);
        return map;
    }
    
    @GetMapping("/car/{id}/{username}/list")
    public Map<String, Object> getCar(
            @RequestParam("age") Integer age,
            @RequestParam("inters") List<Object> list
    ) {
        Map<String, Object> map = new HashMap<>();
        map.put("age", age);
        map.put("list", list);
        return map;
    }
}
