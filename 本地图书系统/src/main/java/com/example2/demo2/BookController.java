package com.example2.demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
/*
组合注解，相当于 @Controller + @ResponseBody。
表示这个类的所有方法返回的数据直接写入 HTTP 响应体（返回 JSON，而不是跳转页面）。
 */
@RequestMapping("/books")
//给这个控制器设置一个基础路径。下面所有接口的 URL 前面都要加上 /books。
public class BookController {

    @Autowired
    //自动注入。Spring 会自动找到 BookRepository 的实现类（JPA 会自动生成），并赋值给这个变量。
    //这样你就能在控制器里直接调用数据库操作方法，不用自己写 SQL。
    private BookRepository bookRepository;

    // 获取所有书
    @GetMapping
    public List<Book> getAll() {
        return bookRepository.findAll();
        /*
        @GetMapping：处理 GET /books 请求。
        findAll()：JPA 自带方法，查询表中所有记录，返回 List<Book>。
        效果：浏览器访问 http://localhost:8080/books，返回所有图书的 JSON 数组。

         */
    }

    // 找一本书
    @GetMapping("/{id}")
    public Book getOne(@PathVariable Integer id) {
        return bookRepository.findById(id).orElse(null);
        /*
        @GetMapping("/{id}")：处理 GET /books/1、/books/2 这样的请求。
@PathVariable Integer id：把 URL 路径里的 {id} 提取出来，转成 Integer 传入方法。
findById(id)：根据主键查询单条记录，返回 Optional<Book>。
.orElse(null)：如果找不到，返回 null（实际项目中建议返回 404 状态码）。
         */
    }

    // 加书
    @PostMapping
    public String add(@RequestBody Book book) {
        Integer max = bookRepository.findMaxDisplayOrder();
        if (max == null){
            book.setDisplayOrder(1);
        }else {
            book.setDisplayOrder(max + 1);
        }
        Book saved = bookRepository.save(book);
        return "添加成功，ID=" + saved.getDisplayOrder();
        /*
        @PostMapping：处理 POST /books 请求（新增数据）。
@RequestBody Book book：把请求体（Body）里的 JSON 数据自动转换成 Book 对象。例如前端传 {"name":"西游记"}，Spring 会自动调用 setName("西游记")。
save(book)：JPA 的保存方法。如果 id 为空就插入，有值就更新。这里返回保存后的对象（包含数据库生成的 ID）。
         */
    }

    // 修改书
    @PutMapping("/{id}")
    public String update(@PathVariable Integer id, @RequestBody Book book) {
        Optional<Book> optional = bookRepository.findById(id);
        if (optional.isEmpty()){
            return "书不存在";
        }
        Book existing = optional.get();
        existing.setName(book.getName());
        bookRepository.save(existing);
        return "修改成功";
        /*
        @PutMapping：处理 PUT /books/1 请求（修改数据）。
先检查 existsById(id)：判断这本书是否存在。
book.setId(id)：把 URL 里的 ID 设置到对象上，这样 save() 就知道是更新而不是插入。
         */
    }

    // 删除书
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id) {
        if (!bookRepository.existsById(id)) {
            return "书不存在";
        }
        bookRepository.deleteById(id);
        List<Book> books = bookRepository.findAllByOrderByDisplayOrderAsc();
        for (int i = 0;i<books.size();i++){
            books.get(i).setDisplayOrder(1 + i);
            bookRepository.save(books.get(i));
        }
        return "删除成功";
        /*
        @DeleteMapping：处理 DELETE /books/1 请求。
deleteById(id)：根据主键删除记录。
         */
    }
}