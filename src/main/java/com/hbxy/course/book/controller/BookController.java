package com.hbxy.course.book.controller;

import com.hbxy.course.book.model.Book;
import com.hbxy.course.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.validation.Valid;
import java.io.IOException;
import java.util.List;

@Controller
public class BookController {

    @Autowired
    BookService bookService;

    @RequestMapping("/toBookList")
    public String toBookList(Model model) throws IOException {
       List<Book> list = bookService.findAllBooks();
//        Book book1 = new Book();
//        book1.setId(10001);
//        book1.setName("java");
//        book1.setPublisher("人民邮电");
//        book1.setPrice(89.20);
//
//        Book book2 = new Book();
//        book2.setId(10002);
//        book2.setName("Spring实战");
//        book2.setPublisher("人民邮电");
//        book2.setPrice(89.20);
//
//        Book book3 = new Book();
//        book3.setId(10003);
//        book3.setName("Hadoop权威指南");
//        book3.setPublisher("清华大学出版社");
//        book3.setPrice(100);
//
//        list.add(book1);
//        list.add(book2);
//        list.add(book3);



        //放进model，传给jsp
        model.addAttribute("booklist",list);
        return "/jsp/book/booklist";
    }
//    //使用request对对象获得id
//        @RequestMapping("/bookDelete")
//        public String bookDelete(HttpServletRequest request,Model model){
//            String id = request.getParameter("id");
//            StringBuilder msg = new StringBuilder();
//            msg.append("选择的图书ID为：<br / >");
//            msg.append("id=" + id);
//            model.addAttribute("msg",msg.toString());
//            return "jsp/book/success";
//        }

        @RequestMapping("/toBookDelete")
        public String bookDelete(Integer id,Model model) {
//        StringBuilder msg = new StringBuilder();
//        msg.append("选择的图书ID为：<br />");
//        msg.append("id=" + id);
//        model.addAttribute("msg",msg.toString());
            bookService.deleteBook(id);
            return "redirect:/toBookList";
        }

        @RequestMapping("/toBookAdd")
        public String toBookAdd(Model model){

        return "/jsp/book/bookadd";
        }

        @RequestMapping("/bookAdd")
        public String bookAdd(@Valid @ModelAttribute Book book, BindingResult bindingResult, Model model) {

            if (bindingResult.hasErrors()) {
                FieldError nameerr = bindingResult.getFieldError("name");
                FieldError publishererr = bindingResult.getFieldError("publisher");
                FieldError priceerr = bindingResult.getFieldError("price");
                FieldError publishDateerr = bindingResult.getFieldError("pulishDate");
                if (nameerr != null) {
                    model.addAttribute("nameerr", nameerr.getDefaultMessage());
                }
                if (publishererr != null) {
                    model.addAttribute("publishererr", publishererr.getDefaultMessage());
                }
                if (priceerr != null) {
                    model.addAttribute("priceerr", "价格必须是数字，最大999，小数点最多两位");
                }
                if (publishDateerr != null) {
                    model.addAttribute("publishDateerr", "出版时间必须为日期格式：2018-12-11");
                }
                return "/jsp/book/bookadd";
            }else{
//                StringBuilder msg = new StringBuilder();
//                msg.append("添加的图书信息为：<br />");
//                msg.append("图书名称=" + book.getName() + "<br/>");
//                msg.append("出版社=" + book.getPublisher() + "<br/>");
//                msg.append("价格" + book.getPrice() + "<br/>");
//                msg.append("出版日期="+book.getPublishDate()+"<br/>");
//                model.addAttribute("msg", msg.toString());

//                return "/jsp/book/success";
                bookService.addBook(book);
                return "redirect:/toBookList";
            }
        }

        @RequestMapping("/toBookEdit")
        public String toBookEdit(Integer id,Model model){
          //Book book = new Book();

//        book.setId(1001);
//        book.setName("Spring");
//        book.setPublisher("人民邮电");
//        book.setPrice(110);
            //放进model
        Book book = bookService.findBookById(id);
        model.addAttribute("book",book);
        return "/jsp/book/bookedit";

        }

        @RequestMapping("/bookEdit")
        public String bookEdit(Book book,Model model){
//        StringBuilder msg = new StringBuilder();
//        msg.append("修改的图书信息为：<br/>");
//        msg.append("图书ID="+book.getId()+"<br/>");
//        msg.append("图书名称="+book.getName()+"<br/>");
//        msg.append("出版社="+book.getPublisher()+"<br />");
//        msg.append("价格"+book.getPrice()+"<br />");
//        model.addAttribute("msg",msg.toString());
//        return "/jsp/book/success";
            bookService.updateBook(book);
            return "redirect:/toBookList";
        }
}
