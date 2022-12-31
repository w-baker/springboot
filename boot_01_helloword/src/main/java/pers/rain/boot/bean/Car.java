package pers.rain.boot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @Auther: W-CH
 * @Time: 2022-11-23 10:58
 * @E-mail: wang.xiaohong.0817@gmail.com
 * @Software: IntelliJ IDEA
 *
 * 只有在容器中的组件，才有SpringBoot提供的强大功能
 */
//@Component //扫描到ioc容器
@Data //生成getter、setter方法
@ToString
@NoArgsConstructor
@AllArgsConstructor
@ConfigurationProperties(prefix = "mycar") //配置属性
public class Car {
    private String brand;
    private Integer price;

}
