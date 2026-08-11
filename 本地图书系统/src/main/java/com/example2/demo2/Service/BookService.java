package com.example2.demo2.Service;

import com.example2.demo2.Entity.Book;
import com.example2.demo2.Repository.BookRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 夏辰义
 * 2026/8/1020:50
 */
@Service
//只穿这一件衣服，不要穿 @RestController
public class BookService {


    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }//构造器
    //构造器注入：Spring 会自动把 BookRepository 的实例传进来并赋值。
    //这是 Spring 推荐的注入方式，比 @Autowired 字段注入更好（利于测试、避免循环依赖）。

    // 获取所有书
    public List<Book> findAll() {
        return bookRepository.findAllByOrderByDisplayOrderAsc();
        //方法名不叫 getAll，叫 findAll。因为 Service 不关心 HTTP，它只关心"查找"
    }

    // 加书
    public Book add(String name) {// ← 只接收一个 String，不接收 Book 实体
        Integer max = bookRepository.findMaxDisplayOrder();
        Book book = new Book();
        book.setName(name);
        book.setDisplayOrder(max == null ? 1 : max + 1);
        return bookRepository.save(book);
    }

    // 修改书
    public Book update(Integer id ,String name){
        Book book = bookRepository.findById(id).orElseThrow(() -> new RuntimeException("书不存在"));//找到书
        //bookRepository.findById(id) 返回什么？
        //返回的是 Optional<Book>，不是直接返回 Book
        //.orElseThrow(...) 是什么意思？
        //"如果盒子是空的，就抛出异常；如果有书，就把书拿出来。
        book.setName(name);
        return bookRepository.save(book);//返回改好的书
    }

    //删除书
    public void delete(Integer id){
        Book book = bookRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("书不存在"));
        bookRepository.delete(book);

        // 重排序号
        List<Book> books = bookRepository.findAllByOrderByDisplayOrderAsc();
        for (int i = 0; i < books.size(); i++) {
            books.get(i).setDisplayOrder(i + 1);
        }
        bookRepository.saveAll(books);  // ← 用 saveAll 代替循环 save
    }

    public Book findById(Integer id) {
        return bookRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("书不存在"));
    }
}
