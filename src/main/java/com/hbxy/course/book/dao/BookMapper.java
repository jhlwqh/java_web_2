package com.hbxy.course.book.dao;

import com.hbxy.course.book.model.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface BookMapper {
    public Book findBookById(Integer id);
    public List<Book> findBookByName(String name);
    public void addBook(Book book);
    public void updateBook(Book book);
    public void deleteBook(Integer id);
    public List<Book> findAllBooks();

}
