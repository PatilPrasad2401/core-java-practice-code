package com.prasad.practice.dateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimeDemo {
    public static void main(String[] args) {
        LocalDate today=LocalDate.now();
        System.out.println("Today's date :"+today);
//        add 1 month today's date
        LocalDate oneMonthLaterDate=today.plus(1, ChronoUnit.MONTHS);
        System.out.println("After one month date will be :"+oneMonthLaterDate);

//        LocalDate twentyEightDayAgoDate=today.minus(28,ChronoUnit.DAYS);
        LocalDate twentyEightDayAgoDate=today.minusDays(28);
        System.out.println("28 days ago date was :"+twentyEightDayAgoDate);

        LocalDateTime todayTime=LocalDateTime.now();
        System.out.println("Current date Time :"+todayTime);
        LocalDateTime oneMinuitLaterTime=todayTime.plusMinutes(1);
        System.out.println("After 1 minuit will be :"+oneMinuitLaterTime);

        LocalDateTime fourDaysAgoDateTime=todayTime.minusHours(95);
        System.out.println("four days ago date was :"+fourDaysAgoDateTime);
    }
}
