package pers.rain.mapper;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.support.LambdaMeta;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import pers.rain.bean.Book;

/**
 * @Auther: W-CH
 * @Time: 2022-11-27 10:19
 * @E-mail: wang.xiaohong.0817@gmail.com
 * @Software: IntelliJ IDEA
 */

@SpringBootTest
public class BookMapperTest {
    @Autowired
    private BookMapper bookMapper;
    @Test
    void testGetBuyId(){
        Book book = bookMapper.selectById(1);
        System.out.println(book);
    }
    @Test
    void testInsert(){
        bookMapper.insert(new Book(null, "小说", 13, 3));
    }
    @Test
    void testGetPage(){
        IPage page = new Page(5,3);
        IPage page1 = bookMapper.selectPage(page, null);
        System.out.println(page1);
    }
    @Test
    void testGetBy(){
        QueryWrapper<Book> qw = new QueryWrapper<>();
        qw.like("book_name", "徐");
        bookMapper.selectList(qw);
    }
    @Test
    void testGetBy1(){
        String name = null;
        LambdaQueryWrapper<Book> lqw = new LambdaQueryWrapper<>();
        lqw.like(name != null,Book::getBookName, "徐");
        bookMapper.selectList(lqw);
    }
}
