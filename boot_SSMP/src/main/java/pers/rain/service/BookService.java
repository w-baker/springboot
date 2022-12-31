package pers.rain.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.stereotype.Service;
import pers.rain.bean.Book;

import java.util.List;

/**
 * @Auther: W-CH
 * @Time: 2022-11-27 14:26
 * @E-mail: wang.xiaohong.0817@gmail.com
 * @Software: IntelliJ IDEA
 */
public interface BookService {
    Boolean save(Book book);
    Boolean update(Book book);
    Boolean delete(Integer id);
    Book getById(Integer id);
    List<Book> getAll(Integer id);
    IPage getPage(Integer currentPage,Integer pageSize);
}
