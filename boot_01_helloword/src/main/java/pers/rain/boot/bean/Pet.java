package pers.rain.boot.bean;

import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Auther: W-CH
 * @Time: 2022-11-23 10:34
 * @E-mail: wang.xiaohong.0817@gmail.com
 * @Software: IntelliJ IDEA
 */

@NoArgsConstructor
@AllArgsConstructor //全参构造器
@Data
@ToString
public class Pet {
    private String name;

}

