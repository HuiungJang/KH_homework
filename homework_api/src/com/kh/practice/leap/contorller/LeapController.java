package com.kh.practice.leap.contorller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class LeapController {

    public Boolean isLeapYear(int year){
        // 윤년이면 true 아니면 false
        // 연도가 4의 배수이면서 100의 배수가 아니거나 400의 배수가 되는해.

        boolean b = false;
        if(year%4 ==0 && (year%100 != 0 || year % 400 ==0)){
            b = true;
        }

        return b;
    }

    public long leapDate(Calendar c){
        // 1년 1월 1일부터 오늘까지 총 날수 계산.
        // 윤년에는 366 평년 365
        // 윤년이면 2월을 29일까지 아니면 28일까지
        // 31일까지 있는 달 1 3 5 7 8 10 12
        // 30일까지 있는 달 4 6 9 11
        Date today = new Date ( );

        int Year= 1;
        int presentYear = c.get(Calendar.YEAR);
        // 현재 연도
        int totalY =(presentYear-1)*365;
        // 작년까지 연도 *365일


        Calendar cal = Calendar.getInstance ( );
        Calendar cal2 = Calendar.getInstance ( );
        // Calendar 객체 생성.

        cal.setTime ( today );
        // 오늘 날짜로 만듦.
        cal2.set ( presentYear, Calendar.JANUARY, 1 );
        // 현재 연도 1월1일으로 만듦.

        int count = 0;
        // 일수 증가시키기 위함
        while ( !cal2.after ( cal ) ) {
            // cal이 cal2보다 이후가 아닌동안 반복.
            count++;
            // 일수 증가.
            cal2.add ( Calendar.DATE, 1 );
            // 현재연도 1월 1일부터 1일 뒤 날짜로 바뀜.
        }

        return count+totalY;
    }

}
