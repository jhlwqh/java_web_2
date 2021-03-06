package com.hbxy.course.util;




import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
//实现将字符串转换成日期类型
public class DateConverter implements Converter<String,Date> {
    @Override
    public Date convert(String s){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return dateFormat.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;//如果参数失败返回null
    }
}
