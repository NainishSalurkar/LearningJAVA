package learn_jave_2;

import java.util.Scanner;

public class InputCalculator {
   public static void inputThenPrintSumAndAverage(){
	       Scanner scanner=new Scanner(System.in);
	       
	       int sum=0;
	       int count=0;
	       int number =0;
	      
	           while(true){
	        	   boolean hasNextInt = scanner.hasNextInt();
	        	   if(hasNextInt) {
	               number=scanner.nextInt();
	               
	               sum+=number;
	               count++;
	               }else {
	            	   break;
	               }
	           }
	           scanner.nextLine();
	           int avg = (int) Math.round((double) sum/count);
	           System.out.println("SUM = " + sum +" AVG = " +avg);
	           scanner.close();
	           
	       }
	   }
