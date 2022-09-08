package learn_jave_2;

public class FlourPacker {
    public static boolean canPack( int bigCount, int smallCount, int goal){
        if(bigCount<0 || smallCount<0 || goal<0)
        return false;
        
        if(bigCount*5 + smallCount<goal){
            return false;
        }
        return smallCount>=(goal%5);
        
    }
    
    
}