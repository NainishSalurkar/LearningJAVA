package learn_jave_2;

public class Floor {
   private double width;
   private double length;
   
   public Floor(double width, double length){
       if(length <0.0){
           this.length = 0.0;
       }else if (width<0.0){
           this.width= 0.0;
       }else{
           this.width = width;
           this.length = length;
       }
   }
   
   public double getArea(){
       return width*length;
   }
}


