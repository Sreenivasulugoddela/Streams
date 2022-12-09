package com.training.programs;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class CustomDateFormat
{
    public static void main(String[] args) 
    {
    	
    	LocalDate localDate=LocalDate.now();
    	
    	LocalTime localTime=LocalTime.now();
    	
    	LocalDateTime localDateTime=LocalDateTime.now();
    	System.out.println(localDate);
    	System.out.println(localTime);
    	System.out.println(localDateTime);
    	
    	String dateTime = "2012-02-22T02:06:58.147Z";
    	ZonedDateTime d = ZonedDateTime.parse(dateTime);
    	System.out.println(d);
    
    }
}
