package com.wxm;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Date {
    public static void main(String[] args){
        Date.findDates("2022-08-21","2022-09-21");
    }
    public static List<String> findDates(String beginTime, String endTime) {
        List<String> allDate = new ArrayList();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");


        try {
            java.util.Date dBegin = sdf.parse(beginTime);
            java.util.Date dEnd = sdf.parse(endTime);

            Calendar calBegin = Calendar.getInstance();
            // 使用给定的 Date 设置此 Calendar 的时间
            calBegin.setTime(dBegin);
            Calendar calEnd = Calendar.getInstance();
            // 使用给定的 Date 设置此 Calendar 的时间
            calEnd.setTime(dEnd);
            //这里可以当天再去减一天，把当天也加进去   不然不包括当天
            calBegin.add(Calendar.DAY_OF_MONTH, -1);
            // 测试此日期是否在指定日期之后
            while (calEnd.after(calBegin)) {
                // 根据日历的规则，为给定的日历字段添加或减去指定的时间量
                calBegin.add(Calendar.DAY_OF_MONTH, 1);
                allDate.add(sdf.format(calBegin.getTime()));
            }
            System.out.println("时间==" + allDate);
        }catch (Exception e){
            e.printStackTrace();
        }
        return allDate;
    }
}
