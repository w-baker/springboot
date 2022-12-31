package pers.rain.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import pers.rain.bean.Book;

import java.util.Random;
import java.util.stream.IntStream;

/**
 * @Auther: W-CH
 * @Time: 2022-11-27 14:47
 * @E-mail: wang.xiaohong.0817@gmail.com
 * @Software: IntelliJ IDEA
 */
@SpringBootTest
public class BookServiceTestCase {
    @Autowired
    private IBookService bookService;
    @Test
    void save() {
        System.out.println(bookService.save(new Book(null, "西游记", 30, 50)));
    }
    
    @Test
    void update() {
        Book book = new Book(11, "三国演义", 30, 50);
        bookService.update(book,null);
    }
    
    @Test
    void delete() {
        System.out.println(bookService.removeById(5));
    }
    
    @Test
    void getById() {
        Book book = bookService.getById(10);
        System.out.println(book);
    }
    
    @Test
    void getAll() {
    }
//    @Test
//    void save1() {
//        for(int i = 0;i < 953;i++){
//            Random r = new Random();
//            int price = r.nextInt(10) + 10;
//            int stock = r.nextInt(60) + 20;
//            bookService.save(new Book(null, "测试数据" + i, price, stock));
//        }
//    }
}
