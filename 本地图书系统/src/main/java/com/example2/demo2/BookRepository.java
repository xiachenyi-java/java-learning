package com.example2.demo2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 夏辰义
 * 2026/7/3017:44
 */
@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {

    @Query("SELECT MAX(b.displayOrder) FROM Book b")
    Integer findMaxDisplayOrder();

    List<Book>findAllByOrderByDisplayOrderAsc();
    //findAll = 查全部
    //ByOrderBy = 按...排序
    //DisplayOrder = 你的属性名
    //Asc = 升序（从小到大）

}
