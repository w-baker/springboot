package pers.rain;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pers.rain.bean.TBook;
import pers.rain.bean.TBookExample;
import pers.rain.mapper.TBookMapper;

import java.util.List;

@SpringBootTest
class BootDruidApplicationTests {
    
    @Autowired
    private TBookMapper bookMapper;
    @Test
    void contextLoads() {
        List<TBook> tBooks = bookMapper.selectByExample(null);
        for (TBook tBook : tBooks) {
            System.out.println(tBook.toString());
        }
    }
    
}
