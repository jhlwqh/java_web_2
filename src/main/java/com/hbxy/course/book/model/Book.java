package com.hbxy.course.book.model;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

public class Book {
    private int id;
    @NotNull(message="书名不能为空，长度在1-100字之间")
    @Size(min = 1,max = 100,message = "书名不能为空，长度在1-100自之间")
    private String name;
    @NotNull(message="出版社不能为空，长度在2-50字之间")
    @Size(min = 1,max = 100,message = "出版社不能为空，长度在2-50字之间")
    private String publisher;
    @NotNull(message="价格必须是数字，最大999，小数点最多两位")
    @Digits(integer = 3,fraction = 2,message = "价格必须是数字，最大999，小数点最多两位")
    private double price=0.0;
    private Date publishDate;

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("id=");
        stringBuffer.append(id);
        stringBuffer.append("\n");
        stringBuffer.append("name=");
        stringBuffer.append(name);
        stringBuffer.append("\n");
        stringBuffer.append("publisher=");
        stringBuffer.append(publisher);
        stringBuffer.append("\n");
        stringBuffer.append("price=");
        stringBuffer.append(price);
        stringBuffer.append("\n");
        stringBuffer.append("publishDate=");
        stringBuffer.append(publishDate);
        stringBuffer.append("\n");
        return stringBuffer.toString();

    }


}
