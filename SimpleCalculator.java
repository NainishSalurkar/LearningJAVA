package learn_jave_2;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;
    
     public void setSecondNumber(double secondNumber){
        this.secondNumber=secondNumber;
    }
     public void setFirstNumber(double firstNumber){
        this.firstNumber=firstNumber;
    }
    public double getFirstNumber(){
        return firstNumber;
    }
    public double getSecondNumber(){
        return secondNumber;
    }
    public double getAdditionResult(){
        return firstNumber+secondNumber;
    }
     public double getSubtractionResult(){
        return firstNumber-secondNumber;
    }
     public double getMultiplicationResult(){
        return firstNumber*secondNumber;
    }
     public double getDivisionResult(){
        if(secondNumber!=0){
            return firstNumber/secondNumber;
    }else{
        return 0;
    }
     }
}