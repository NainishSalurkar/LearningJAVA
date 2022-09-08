package learn_jave_2;
public class TeenNumberChecker {
    public static boolean hasTeen(int num,int num1,int num2){
        if(num>=13 && num<=19 || num1>=13 && num1<=19 || num2>=13 && num2<=19){
            return true;
        }
        return false;
    }
    public static boolean isTeen(int num)
    {if(num>=13 && num<=19){
        return true;
    }
        return false;
    }
 
}