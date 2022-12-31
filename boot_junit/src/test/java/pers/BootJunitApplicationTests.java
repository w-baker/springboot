package pers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import pers.rain.BootJunitApplication;
import pers.rain.dao.BookDao;

// 显式设定引导类
//@SpringBootTest(classes = BootJunitApplication.class)
@SpringBootTest
class BootJunitApplicationTests {
    // 1.注入要测试的对象
    // 2.测试方法
    @Autowired
    private BookDao bookDao;
    @Test
    void contextLoads() {
        bookDao.save();
    }
}
