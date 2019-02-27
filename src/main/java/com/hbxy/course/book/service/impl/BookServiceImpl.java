package com.hbxy.course.book.service.impl;

import com.hbxy.course.book.dao.BookMapper;
import com.hbxy.course.book.model.Book;
import com.hbxy.course.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;
    @Override
    public Book findBookById(Integer id) {
        return bookMapper.findBookById(id);
    }

    @Override
    public List<Book> findBookByName(String name) {
        return bookMapper.findBookByName(name);
    }

    @Override
    public void addBook(Book book) {
        bookMapper.addBook(book);
    }

    @Override
    public void updateBook(Book book) {
        bookMapper.updateBook(book);
    }

    @Override
    public void deleteBook(Integer id) {
        bookMapper.deleteBook(id);
    }

    @Override
    public List<Book> findAllBooks() {
        return bookMapper.findAllBooks();
    }
}
