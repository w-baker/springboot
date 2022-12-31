package pers.rain.crontroller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pers.rain.bean.Book;
import pers.rain.crontroller.utils.R;
import pers.rain.service.IBookService;

import java.io.IOException;
import java.util.List;

/**
 * @Auther: W-CH
 * @Time: 2022-11-27 15:20
 * @E-mail: wang.xiaohong.0817@gmail.com
 * @Software: IntelliJ IDEA
 */
@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private IBookService bookService;
    
    @GetMapping
    public R getAll() {
        List<Book> list = bookService.list();
        return new R(true,list);
    }
    
    @PostMapping()
    public R save(@RequestBody Book book) {
        return new R(bookService.save(book));
    }
    @PutMapping
    public R update(@RequestBody Book book){
        return new R(bookService.update(book));
    }
    @DeleteMapping("/{id}")
    public R delete(@PathVariable Integer id){
        return new R(true,bookService.delete(id));
    }
    
    @GetMapping("/{id}")
    public R getById(@PathVariable Integer id){
        return new R(true,bookService.getById(id));
    }
    
//    @GetMapping("/{currentPage}/{pageSize}")
//    public R getPage(@PathVariable Integer currentPage,@PathVariable Integer pageSize){
//        IPage<Book> page = bookService.getPage(currentPage, pageSize);
//        //当当前页码值大于总页码值，那么重新执行查询操作，使用最大页码值作为当前页码值
//        if(currentPage > page.getPages()){
//            page = bookService.getPage((int) page.getPages(), pageSize);
//        }
//        return new R(true, page);
//    }
    @GetMapping("/{currentPage}/{pageSize}")
    public R getPage(@PathVariable Integer currentPage,@PathVariable Integer pageSize,Book book){
        
        IPage<Book> page = bookService.getPage(currentPage, pageSize,book);
        //当当前页码值大于总页码值，那么重新执行查询操作，使用最大页码值作为当前页码值
        if(currentPage > page.getPages()){
            page = bookService.getPage((int) page.getPages(), pageSize,book);
        }
        return new R(true, page);
    }
}
