package pers.rain.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.rain.bean.Book;
import pers.rain.mapper.BookMapper;
import pers.rain.service.BookService;

import java.util.List;

/**
 * @Auther: W-CH
 * @Time: 2022-11-27 14:28
 * @E-mail: wang.xiaohong.0817@gmail.com
 * @Software: IntelliJ IDEA
 */
@Service
public class BookServiceImpl2 implements BookService {
    @Autowired
    private BookMapper bookMapper;
    @Override
    public Boolean save(Book book) {
        return bookMapper.insert(book) > 0;
    }
    
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
    public List<Book> getAll(Integer id) {
        return bookMapper.selectList(null);
    }
    
    @Override
    public IPage getPage(Integer currentPage, Integer pageSize) {
        IPage page = new Page(currentPage,pageSize);
        IPage page1 = bookMapper.selectPage(page, null);
        return page1;
    }
}
