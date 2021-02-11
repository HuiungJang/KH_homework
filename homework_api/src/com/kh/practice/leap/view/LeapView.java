package com.kh.practice.leap.view;

import com.kh.practice.leap.contorller.LeapController;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class LeapView {
    LeapController lc = new LeapController();
    Calendar a = Calendar.getInstance();
    int year = a.get(Calendar.YEAR);

    Date today = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy년은 ");
    String yearRecent = sdf.format(today);

    public LeapView() {
        if(lc.isLeapYear(year) ) {
            System.out.println(yearRecent + "윤년입니다.");
        }else
            System.out.println(yearRecent+"평년입니다.");

        System.out.println("총 날짜 수 : "+lc.leapDate(a));
    }


}
