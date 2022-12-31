package pers.rain.crontroller.utils;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Auther: W-CH
 * @Time: 2022-11-27 16:15
 * @E-mail: wang.xiaohong.0817@gmail.com
 * @Software: IntelliJ IDEA
 */
@Data
@NoArgsConstructor
public class R {
    private Boolean flag;
    private Object data;
    private String msg;
    
    public R(Boolean flag){
        this.flag = flag;
    }
    public R(Boolean flag,Object data){
        this.flag = flag;
        this.data = data;
    }
    public R(Boolean flag,String msg){
        this.flag = flag;
        this.msg = msg;
    }
    public R(String msg){
        this.msg = msg;
    }
}
