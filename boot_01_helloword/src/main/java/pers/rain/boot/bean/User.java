package pers.rain.boot.bean;

import lombok.*;

/**
 * @Auther: W-CH
 * @Time: 2022-11-23 09:43
 * @E-mail: wang.xiaohong.0817@gmail.com
 * @Software: IntelliJ IDEA
 */
@Data //生成getter、setter方法
@ToString
@NoArgsConstructor
//@AllArgsConstructor
@EqualsAndHashCode
public class User {
    private String name;
    private Integer id;
    
    private Pet pet;
    public User(String name,Integer id){
        this.id = id;
        this.name = name;
    }
}
