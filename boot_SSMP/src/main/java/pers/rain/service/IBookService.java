package pers.rain.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import pers.rain.bean.Book;

import java.util.List;

/**
 * @Auther: W-CH
 * @Time: 2022-11-27 14:43
 * @E-mail: wang.xiaohong.0817@gmail.com
 * @Software: IntelliJ IDEA
 */
public interface IBookService extends IService<Book> {
    Boolean update(Book book);
    Boolean delete(Integer id);
    Book getById(Integer id);
    IPage getPage(Integer currentPage, Integer pageSize);
    IPage getPage(Integer currentPage, Integer pageSize,Book book);
}
