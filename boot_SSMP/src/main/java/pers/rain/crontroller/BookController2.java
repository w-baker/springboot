package pers.rain.crontroller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pers.rain.bean.Book;
import pers.rain.service.IBookService;

import java.util.List;

/**
 * @Auther: W-CH
 * @Time: 2022-11-27 15:20
 * @E-mail: wang.xiaohong.0817@gmail.com
 * @Software: IntelliJ IDEA
 */
//@RestController
@RequestMapping("/books")
public class BookController2 {
    @Autowired
    private IBookService bookService;
    
    @GetMapping
    public List<Book> getAll(){
        return bookService.list();
    }
    
    @PostMapping()
    public Boolean save(@RequestBody Book book){
        return bookService.save(book);
    }
    @PutMapping
    public Boolean update(@RequestBody Book book){
        return bookService.update(book);
    }
    @DeleteMapping("/{id}")
    public Boolean delete(@PathVariable Integer id){
        return bookService.delete(id);
    }
    
    @GetMapping("/{id}")
    public Book getById(@PathVariable Integer id){
        return bookService.getById(id);
    }
    
    @GetMapping("/{currentPage}/{pageSize}")
    public IPage<Book> getPage(@PathVariable Integer currentPage,@PathVariable Integer pageSize){
        return bookService.getPage(currentPage,pageSize );
    }
}
