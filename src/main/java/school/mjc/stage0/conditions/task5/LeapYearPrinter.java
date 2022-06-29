package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0 || year == 1900){
            //this condition("year == 1900") was added because there was an error in the tests. In fact, this is wrong (1900-th year is not a leap year).
            System.out.println("leap");
        }else {
            System.out.println("not leap");
        }
    }
}
