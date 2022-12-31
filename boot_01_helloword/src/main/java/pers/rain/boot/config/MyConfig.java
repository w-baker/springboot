package pers.rain.boot.config;

import ch.qos.logback.core.db.DBHelper;
import jdk.nashorn.internal.scripts.JD;
import org.slf4j.Logger;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import pers.rain.boot.bean.Car;
import pers.rain.boot.bean.Pet;
import pers.rain.boot.bean.User;

/**
 * 1、配置类里面使用@Bean标注在方法上给容器注册组件，默认也是单例的
 * 2、配置类本身也是组件
 * 3、proxyBeanMethods:代理bean的方法
 *      full(proxyBeanMethods = true)
 *      lite(proxyBeanMethods = false)
 *      组件依赖
 * 4、@Import({User.class, DBHelper.class})
 *      给容器中自动创建组件,默认为组件的全类名
 * @Auther: W-CH
 * @Time: 2022-11-23 09:44
 * @E-mail: wang.xiaohong.0817@gmail.com
 * @Software: IntelliJ IDEA
 */
@Configuration(proxyBeanMethods = true) //告诉springboot这是一个配置类，等同于配置文件
@Import({User.class, DBHelper.class})
//@ConditionalOnBean(name = "tom") //条件装配
@ImportResource("classpath:spring.xml") //导入配置文件

@EnableConfigurationProperties(Car.class)
// 1、开启属性配置
// 2、将组件注册进容器中

public class MyConfig {
    
    @Bean("MyBaker") //给容器添加组件，以方法名作为组件id，返回类型就是组件类型，方法返回的值就是容器中的实例
    public User baker(){
        return new User("baker",16);
    }
    
//    @ConditionalOnBean(name = "tom")
    @ConditionalOnMissingBean(name = "tom")
    @Bean //给容器添加组件，以方法名作为组件id，返回类型就是组件类型，方法返回的值就是容器中的实例
    public User rain(){
        User rain = new User("rain", 16);
        rain.setPet(tom());
        return rain;
    }
    
//    @Bean("tom2")
    public Pet tom(){
        return new Pet("tomcat");
    }
}
