package pers.rain.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pers.rain.bean.Book;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Auther: W-CH
 * @Time: 2022-11-27 14:31
 * @E-mail: wang.xiaohong.0817@gmail.com
 * @Software: IntelliJ IDEA
 */
@SpringBootTest
class BookServiceTest {
    @Autowired
    private BookService service;
    @Test
    void save() {
        System.out.println(service.save(new Book(null, "西游记", 30, 50)));
    }
    
    @Test
    void update() {
        System.out.println(service.update(new Book(10, "三国演义", 30, 50)));
    }
    
    @Test
    void delete() {
        System.out.println(service.delete(5));
    }
    
    @Test
    void getById() {
        System.out.println(service.getById(10));
    }
    
    @Test
    void getAll() {
    }
}