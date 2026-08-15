package com.example2.demo2.Controller;

import com.example2.demo2.Dto.BookDTO;
import com.example2.demo2.Entity.Book;
import com.example2.demo2.Service.BookService;
import com.example2.demo2.common.Result;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
/*
组合注解，相当于 @Controller + @ResponseBody。
表示这个类的所有方法返回的数据直接写入 HTTP 响应体（返回 JSON，而不是跳转页面）。
 */
@RequestMapping("/books")
//给这个控制器设置一个基础路径。下面所有接口的 URL 前面都要加上 /books。
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    // 获取所有书
    @GetMapping
    public Result<Page<Book>> getAll(@RequestParam(defaultValue = "1")
                                     int page, @RequestParam(defaultValue = "5")
                                     int size
                                     ) {
       return Result.success(bookService.findPage(page,size));
    }

    // 找一本书
    @GetMapping("/{id}")
    public Result<Book> getOne(@PathVariable Integer id) {
      return Result.success(bookService.findById(id));
    }

    @GetMapping("/search")
    public Result<List<Book>> search(@RequestParam String keyword){
        return Result.success(bookService.search(keyword));
    }

    // 加书
    @PostMapping
    public Result<Book> add(@RequestBody @Valid BookDTO book) {
     Book saved = bookService.add(book.getName());
     return Result.success(saved);
    }

    // 修改书
    @PutMapping("/{id}")
    public Result<Book> update(@PathVariable Integer id, @RequestBody @Valid BookDTO book) {
        return Result.success(bookService.update(id, book.getName()));
    }

    // 删除书
    @DeleteMapping("/{id}")
    public Result<Void> delete(@PathVariable Integer id) {
        bookService.delete(id);
        return Result.success();
    }
}