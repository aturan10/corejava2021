package day22dateaccessmodifiersstringbuilders;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
public class Date01 {
    public static void main(String[] args) {
        
        //how to create date object
        
        LocalDate currentDate1 = LocalDate.now();
        
        System.out.println(currentDate1);//2021-07-12
        
        System.out.println(currentDate1.plusDays(8)); //2021-07-20 ==>daysToAdd
        System.out.println(currentDate1.plusMonths(2));//2021-09-12 ==monthsToAdd
        System.out.println(currentDate1.plusYears(5));//2026-07-12
        System.out.println(currentDate1.plusDays(-11));//2021-07-01
        
        System.out.println(currentDate1.plusDays(4).plusMonths(3).plusYears(2));//2023-10-16
        
        System.out.println(currentDate1.getYear());//2021
        System.out.println(currentDate1.getMonth());//JULY
        System.out.println(currentDate1.getMonthValue());//7
        System.out.println(currentDate1.getDayOfMonth());//12
        System.out.println(currentDate1.getDayOfWeek()); // MONDAY
        
        
        System.out.println(currentDate1.plusWeeks(2));//2021-07-26
        
        System.out.println(currentDate1.minusDays(10));//2021-07-02
        
        
        LocalDate date2 = LocalDate.of(2020, 8, 10);
        ////2021-07-12 vs 2020, 8, 10
        System.out.println(currentDate1.isAfter(date2));//true
        System.out.println(currentDate1.isBefore(date2));//false
        
        LocalDateTime dateTime1 =LocalDateTime.now();
        System.out.println(dateTime1); //2021-07-12T19:45:51.977359
        
        
        LocalDate currentDate2 = LocalDate.now();
        System.out.println(currentDate2);//2021-07-12
        
        DateTimeFormatter dtformat1= DateTimeFormatter.ofPattern("dd/MMM/yy");
        /*
         * M=>Months (1 , 2 ..) , m=> minutes
         * MM=> The number of month (0-)
         * MMM=> First 3 Characters
         * MMMM =>Full name
         * 
         */
        
        
        System.out.println(dtformat1.format(currentDate2.plusMonths(2)));// MMM=> 12/Jul/21 / MM=>12/07/21 /M=>12/7/21
        
        LocalTime currentTime1 = LocalTime.now();
        System.out.println(currentTime1);//20:05:33.835317500
        
        DateTimeFormatter dtformat2= DateTimeFormatter.ofPattern("HH:mm");
        /*hh=> am-pm format
         * HH=> 24 -hour format
         * 
         */
        
        System.out.println(dtformat2.format(currentTime1));//hh:mm => 08:08 vs HH:mm=>20:09
        
        // How to find the difference of two dates
        
        LocalDate d1 = LocalDate.now();
        
        LocalDate d2 = LocalDate.of(1995, 5, 25);
        // it returns Year, Months and Days
        Period age = Period.between(d1, d2);
        
        System.out.println(age);//26Y-1M-18D
        
        //if I want to get just the year
        
        int ageYear = Period.between(d2, d1).getYears();
        
        System.out.println(ageYear); //26 
        
        
        
        
        
        
        
        
    }
}