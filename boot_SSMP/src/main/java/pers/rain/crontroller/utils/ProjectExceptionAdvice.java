package pers.rain.crontroller.utils;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * springmvc异常处理器
 *
 * @Auther: W-CH
 * @Time: 2022-11-28 09:34
 * @E-mail: wang.xiaohong.0817@gmail.com
 * @Software: IntelliJ IDEA
 */
//@ControllerAdvice
@RestControllerAdvice
public class ProjectExceptionAdvice {
    
    @ExceptionHandler
    public R doException(Exception ex){
        ex.printStackTrace();
        return new R("服务器故障，请联系管理员");
    }
}
