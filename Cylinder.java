package learn_jave_2;
public class Cylinder extends Circle{
    private double height;
    public Cylinder(double radius, double height){
        super(radius);
         if(height <= 0){
            this.height = 0;
        }else{
            this.height = height;
        }
    }
    // write your code here
    public double getHeight(){
        return this.height;
    }
    
    public double getVolume(){
        return getArea()*height;
    }
}