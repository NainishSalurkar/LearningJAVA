package learn_jave_2;


public class PerfectNumber {
    public static boolean isPerfectNumber(int num){
        if(num<1){
            return false;
        }else{
            int x=0;
            for(int i=1;i<num;i++){
                if(num%i==0){
                    x+=i;
                }
            }
               if(x==num){
                        return true;
                    }
        }       return false;
        
    }
}