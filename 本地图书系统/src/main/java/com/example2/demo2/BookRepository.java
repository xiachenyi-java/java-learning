package com.example2.demo2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 夏辰义
 * 2026/7/3017:44
 */
@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {
}
