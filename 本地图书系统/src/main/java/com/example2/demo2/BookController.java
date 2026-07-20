package com.example2.demo2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 夏辰义
 * 2026/7/2018:16
 */
@RestController
@RequestMapping("/books")// 所有方法前缀都是 /books
public class BookController {
    //用map方法
    private Map<Integer,Book> books =new HashMap<>();
    private int nextID = 1;//ID自动生成

    //获取所有书的名字
    @GetMapping
    public List<Book> getALL(){
        return new ArrayList<>(books.values());
    }

    //找一本书
    @GetMapping("/{id}")
    public Book getOne(@PathVariable Integer id){
        return books.get(id);
    }

    //加书
    @PostMapping
    public String aad(@RequestBody Book book){
        book.setId(nextID++);
        books.put(book.getId(), book);
        return "添加成功" + book.getId();
    }

    @PutMapping("/{id}")
    public String update(@PathVariable Integer id,@RequestBody Book book){
        Book existing = books.get(id);
        if (existing != null){
            existing.setName(book.getName());
            return "修改成功";
        }
        return "书不存在";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id){
        Book existing = books.get(id);
        if (existing != null){
            books.remove(id);
            nextID--;
            return "删除成功";
        }
        return "书不存在";
    }
}
/*
错误的落后的代码
     for (int i = 0;i <= nextID;i++){
            if (id.equals(books.get(i))){
                books.values() = book.getName();
            }
        }
 */