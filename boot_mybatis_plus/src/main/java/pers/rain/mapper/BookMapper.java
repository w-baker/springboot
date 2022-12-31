package pers.rain.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import pers.rain.bean.Book;

@Mapper
public interface BookMapper extends BaseMapper<Book> {
}