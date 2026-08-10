package com.example2.demo2.Controller;

import com.example2.demo2.Entity.Book;
import com.example2.demo2.Service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
/*
组合注解，相当于 @Controller + @ResponseBody。
表示这个类的所有方法返回的数据直接写入 HTTP 响应体（返回 JSON，而不是跳转页面）。
 */
@RequestMapping("/books")
//给这个控制器设置一个基础路径。下面所有接口的 URL 前面都要加上 /books。
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }
    // 获取所有书
    @GetMapping
    public List<Book> getAll() {
       return bookService.findAll();
    }

    // 找一本书
    @GetMapping("/{id}")
    public Book getOne(@PathVariable Integer id) {
      return bookService.findById(id);
    }

    // 加书
    @PostMapping
    public String add(@RequestBody String name) {
     Book saved = bookService.add(name);
     return "添加成功，ID=" + saved.getDisplayOrder();
    }

    // 修改书
    @PutMapping("/{id}")
    public String update(@PathVariable Integer id, @RequestBody String name) {
      bookService.update(id,name);
      return "修改成功";
    }

    // 删除书
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id) {
     bookService.delete(id);
        return "删除成功";
    }
}