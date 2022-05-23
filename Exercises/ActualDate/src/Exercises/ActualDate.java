package Exercises;

import java.util.Date;
import java.text.SimpleDateFormat;

public class ActualDate {
    public static void main(String[] args){

        Date nowDate = new Date();
        long timestamp = nowDate.getTime();
        Date fromTimestamp = new Date(timestamp);
        SimpleDateFormat day = new SimpleDateFormat("dd");
        SimpleDateFormat month = new SimpleDateFormat("MM");
        SimpleDateFormat year = new SimpleDateFormat("yyyy");

        java.sql.Date sqlDate = new java.sql.Date(timestamp);
        java.sql.Date sqlDateNow = new java.sql.Date(new java.util.Date().getTime());


        System.out.println("nowDate: " + nowDate);
        System.out.println("timestamp: " + timestamp);
        System.out.println("fromTimestamp: " + fromTimestamp);
        System.out.println("day: " + day.format(nowDate));
        System.out.println("month: " + month.format(nowDate));
        System.out.println("year: " + year.format(nowDate));
        System.out.println("sqlDate: " + sqlDate);
        System.out.println("sqlDateNow: " + sqlDateNow);
    }
}
