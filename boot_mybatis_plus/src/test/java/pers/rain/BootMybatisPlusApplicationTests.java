package pers.rain;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pers.rain.bean.Book;
import pers.rain.mapper.BookMapper;

@SpringBootTest
class BootMybatisPlusApplicationTests {
    @Autowired
    private BookMapper bookMapper;
    @Test
    void contextLoads() {
        Book tBook = bookMapper.selectById(1);
        System.out.println(tBook);
    }
    
}
