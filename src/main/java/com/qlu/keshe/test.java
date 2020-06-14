package com.qlu.keshe;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author：TuoJun
 * @date：2020/06/13 15:24
 * Description：
 */
public class test {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");    //格式化规则
        Date newDate =sdf.parse("2020/6/13");
        java.sql.Date resultDate = new java.sql.Date(newDate.getTime());
        System.out.println(resultDate);
    }
}

