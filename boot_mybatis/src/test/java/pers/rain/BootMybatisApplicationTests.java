package pers.rain;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pers.rain.bean.TBook;
import pers.rain.bean.TBookExample;
import pers.rain.mapper.TBookMapper;

import java.util.List;

@SpringBootTest
class BootMybatisApplicationTests {
    
    @Autowired
    private TBookMapper tBookMapper;
    
    @Test
    void contextLoads() {
        List<TBook> tBooks = tBookMapper.selectByExample(new TBookExample());
        System.out.println(tBooks);
    }
}
