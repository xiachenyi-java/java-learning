package com.example2.demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    // 获取所有书
    @GetMapping
    public List<Book> getAll() {
        return bookRepository.findAll();
    }

    // 找一本书
    @GetMapping("/{id}")
    public Book getOne(@PathVariable Integer id) {
        return bookRepository.findById(id).orElse(null);
    }

    // 加书
    @PostMapping
    public String add(@RequestBody Book book) {
        Book saved = bookRepository.save(book);
        return "添加成功，ID=" + saved.getId();
    }

    // 修改书
    @PutMapping("/{id}")
    public String update(@PathVariable Integer id, @RequestBody Book book) {
        if (!bookRepository.existsById(id)) {
            return "书不存在";
        }
        book.setId(id);
        bookRepository.save(book);
        return "修改成功";
    }

    // 删除书
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id) {
        if (!bookRepository.existsById(id)) {
            return "书不存在";
        }
        bookRepository.deleteById(id);
        return "删除成功";
    }
}