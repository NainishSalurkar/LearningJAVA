package learn_jave_2;
public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes){
        if(minutes<0){
            System.out.println("Invalid Value");
        }else{
        
        long days = (minutes/1440);
        long year = days/365;
        days = days%365;
        System.out.println(minutes +" min = "+year+" y and "+ days+" d" );
    }
    }
}