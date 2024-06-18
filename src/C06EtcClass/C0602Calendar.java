package C06EtcClass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.util.Calendar;

public class C0602Calendar {
    public static void main(String[] args) {
        // java.util 패키지의 Calendar 클래스
//        Calendar calendar = Calendar.getInstance();
//        System.out.println(calendar.getTime());
//
//        System.out.println(calendar.get(Calendar.YEAR));
//        System.out.println(calendar.get(Calendar.MONTH)+1); // 0월부터 시작이라 +1
//        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
//        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
//        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
//        System.out.println(calendar.get(Calendar.MINUTE));
//        System.out.println(calendar.get(Calendar.SECOND));

        // java.time 패키지 : Local ~~ 클래스.
        // 날짜(LocalDate), 시간(LocalTime), 날짜와 시간(LocalDateTime)
        // db 에서는 날짜가 date 타입, 날짜와 시간이 datetime 타입 !
        LocalDate presentDate = LocalDate.now();
        System.out.println(presentDate);
        System.out.println(presentDate.getYear());
        System.out.println(presentDate.getMonth());
        System.out.println(presentDate.getDayOfMonth());
        System.out.println(presentDate.getDayOfWeek());

        LocalTime presentTime = LocalTime.now();
        System.out.println(presentTime);
        System.out.println(presentTime.getHour());
        System.out.println(presentTime.getMinute());
        System.out.println(presentTime.getSecond());

        // 위 두 가지를 합친 게 Datetime. 가장 많이 쓰인다.
        LocalDateTime presentDateTime = LocalDateTime.now();
        System.out.println(presentDateTime);
        System.out.println(presentDateTime.getYear());
        System.out.println(presentDateTime.getHour());

        // 임의로 특정 시간을 만들어내고 싶을 때 : of 메서드 사용
        LocalDate birthDay = LocalDate.of(1996, 4, 30);
        System.out.println(birthDay.getYear());
        System.out.println(birthDay.getMonth());
        System.out.println(birthDay.getDayOfMonth());

        LocalTime birthTime = LocalTime.of(20, 20, 20);
        LocalDateTime birthDayTime = LocalDateTime.of(1996,4,30,5,18,30);

        // 매개변수로 크로노필드 enum 타입을 사용하여 프로그램의 유연성 향상
        System.out.println(birthDayTime.get(ChronoField.YEAR));
        System.out.println(birthDayTime.get(ChronoField.MONTH_OF_YEAR));
        System.out.println(birthDayTime.get(ChronoField.DAY_OF_MONTH));
        System.out.println(birthDayTime.get(ChronoField.HOUR_OF_DAY));
        // 0 : 오전 , 1 : 오후
        System.out.println(birthDayTime.get(ChronoField.AMPM_OF_DAY));
        myWatch(LocalDateTime.now(),ChronoField.AMPM_OF_DAY);
    }

    static void myWatch(LocalDateTime localDateTime, ChronoField c){
        if(c == ChronoField.YEAR){
            System.out.println("연도는 " + localDateTime.get(c) + " 입니다.");
        }
        else if(c == ChronoField.MONTH_OF_YEAR){
            System.out.println("월은 " + localDateTime.get(c) + " 입니다.");
        }
        else if(c == ChronoField.AMPM_OF_DAY){
            if(localDateTime.get(c) == 0){
                System.out.println("오전입니다.");
            }
            else {
                System.out.println("오후입니다.");
            }
        }
    }
}
