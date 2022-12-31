package pers.rain.dao.impl;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import pers.rain.dao.BookDao;

/**
 * @Auther: W-CH
 * @Time: 2022-11-25 19:44
 * @E-mail: wang.xiaohong.0817@gmail.com
 * @Software: IntelliJ IDEA
 */
@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("BookDao ==> save()");
    }
}
