package pers.rain.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import pers.rain.bean.Book;

/**
 * @Auther: W-CH
 * @Time: 2022-11-27 10:17
 * @E-mail: wang.xiaohong.0817@gmail.com
 * @Software: IntelliJ IDEA
 */
@Mapper
public interface BookMapper extends BaseMapper<Book> {
}
