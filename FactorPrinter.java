package learn_jave_2;


public class FactorPrinter {
    public static void printFactors(int x){
        if(x>=1){
            for(int i =1;i<=x;i++){
                if(x%i==0){
                    System.out.println(i);
                }
            }
        }else {
            System.out.println("Invalid Value");
    }
    }
}