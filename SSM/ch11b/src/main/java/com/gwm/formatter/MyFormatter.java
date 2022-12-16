package com.gwm.formatter;

import com.gwm.pojo.GoodsModelb;
import org.springframework.format.Formatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MyFormatter implements Formatter<Date> {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");


    /**
     *parse 将String类型转化为日期格式的
     */
    @Override
    public Date parse(String s, Locale locale) throws ParseException {
       //将字符串转化为日期格式
        return  sdf.parse(s);
    }

    @Override
    public String print(Date date, Locale locale) {
        return sdf.format(date);
    }
}
