package pers.rain.bean;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Auther: W-CH
 * @Time: 2022-11-27 10:07
 * @E-mail: wang.xiaohong.0817@gmail.com
 * @Software: IntelliJ IDEA
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @TableId
    private Integer bookId;
    private String bookName;
    private Integer price;
    private Integer stock;
}
