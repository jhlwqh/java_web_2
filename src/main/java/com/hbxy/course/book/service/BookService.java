package com.hbxy.course.book.service;

import com.hbxy.course.book.model.Book;

import java.util.List;

public interface BookService {
    public Book findBookById(Integer id);
    public List<Book> findBookByName(String name);
    public void addBook(Book book);
    public void updateBook(Book book);
    public void deleteBook(Integer id);
    public List<Book> findAllBooks();
}
