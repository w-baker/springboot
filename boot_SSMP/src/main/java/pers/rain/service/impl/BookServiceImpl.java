package pers.rain.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.rain.bean.Book;
import pers.rain.mapper.BookMapper;
import pers.rain.service.BookService;
import pers.rain.service.IBookService;

import java.util.List;

/**
 * @Auther: W-CH
 * @Time: 2022-11-27 14:45
 * @E-mail: wang.xiaohong.0817@gmail.com
 * @Software: IntelliJ IDEA
 */
@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements IBookService {
    @Autowired
    private BookMapper bookMapper;
    
    @Override
    public Boolean update(Book book) {
        return bookMapper.updateById(book) > 0;
    }
    
    @Override
    public Boolean delete(Integer id) {
        return bookMapper.deleteById(id) > 0;
    }
    
    @Override
    public Book getById(Integer id) {
        return bookMapper.selectById(id);
    }
    
    @Override
    public IPage getPage(Integer currentPage, Integer pageSize) {
        IPage page = new Page(currentPage, pageSize);
        IPage page1 = bookMapper.selectPage(page, null);
        return page1;
    }
    
    @Override
    public IPage getPage(Integer currentPage, Integer pageSize, Book book) {
        LambdaQueryWrapper<Book> lqw = new LambdaQueryWrapper<>();
        lqw.like(book.getBookName() != null, Book::getBookName, book.getBookName()).
                like(book.getPrice() != null, Book::getPrice, book.getPrice()).
                like(book.getStock() != null, Book::getStock, book.getStock());
        IPage page = new Page(currentPage, pageSize);
        IPage page1 = bookMapper.selectPage(page, lqw);
        return page1;
    }
}
