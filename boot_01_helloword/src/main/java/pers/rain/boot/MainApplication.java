package pers.rain.boot;

import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.cache.CacheAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import pers.rain.boot.bean.Pet;
import pers.rain.boot.bean.User;
import pers.rain.boot.config.MyConfig;

/**
 * @SpringBootApplication这是一个SpringBoot应用
 * @Auther: W-CH
 * @Time: 2022-11-22 21:47
 * @E-mail: wang.xiaohong.0817@gmail.com
 * @Software: IntelliJ IDEA
 */

//改变扫描路径
//@SpringBootApplication(scanBasePackages = "pers.rain")
@ComponentScan("pers.rain")
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        // 1.返回ioc容器
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);
        
        // 查看容器组件
//        String[] names = run.getBeanDefinitionNames();
//        for (String name : names) {
//            System.out.println(name);
//        }
        
        // 从容器中获取组件
//        User myBaker = run.getBean("MyBaker", User.class);
//        User myBaker1 = run.getBean("MyBaker", User.class);
//
//        System.out.println(myBaker==myBaker1);
//
//        MyConfig bean = run.getBean(MyConfig.class);
        
        // 如果@Configuration(proxyBeanMethods = true)代理对象调用方法，SpringBoot总会检查，是否存在组件，保证单实例
//        User baker1 = bean.baker();
//        User baker2 = bean.baker();
//        System.out.println(baker2==baker1);
        
        // 获取组件
//        String[] types = run.getBeanNamesForType(User.class);
//        System.out.println("============");
//        for (String type : types) {
//            System.out.println(type);
//        }
        User rain = run.getBean("rain", User.class);
        System.out.println(rain.getPet());
        boolean tom2 = run.containsBean("tom2");
        System.out.println(tom2);
    
        Object dog = run.getBean("dog", Pet.class);
        System.out.println(dog);
    
        int count = run.getBeanDefinitionCount();
        System.out.println(count);
    
        System.out.println("===================");
        String[] names = run.getBeanNamesForType(CacheAutoConfiguration.class);
        System.out.println(names.length);
        
        
        System.out.println("===================");
        String[] names1 = run.getBeanNamesForType(WebMvcProperties.class);
        System.out.println(names1.length);
    }
}
