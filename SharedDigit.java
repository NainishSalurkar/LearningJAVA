package learn_jave_2;
public class SharedDigit {
    public static boolean hasSharedDigit(int x, int y){
        if(x<10 || x>99 || y<10 || y>99)
        return false;
        
        return((x/10 == y/10)||(x/10 == y % 10)||(y/10 == x % 10)||(x%10 == y%10));
        
    }
    // write your code here
}