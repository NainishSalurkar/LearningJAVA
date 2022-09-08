package learn_jave_2;
public class Printer {
    private int tonerLevel;
    private boolean duplex;
    private int pagesPrinted=0;
    
    public Printer(int tonerLevel, boolean duplex){
        if(tonerLevel>-1 && tonerLevel<100){
            this.tonerLevel = tonerLevel;
        }else{
            this.tonerLevel = -1;
        }
        this.duplex = duplex;
        
    }
    
    public int addToner(int tonerAmount){
        
            if((tonerLevel + tonerAmount)>100){
                return -1;
            }else if((tonerAmount >0 && tonerAmount <=100) && (tonerAmount + this.tonerLevel <=100)){
                tonerLevel += tonerAmount;
                return tonerLevel;
            }
        else{
            return -1;
        }
    }
    
    public int printPages(int pages){
        int pagesToPrint = 0;
        if (duplex){
            System.out.println("Printing in duplex mode");
            pagesToPrint = pages /2 + pages %2;
            this.pagesPrinted += pagesToPrint;
 
 
        }else{
            pagesToPrint = pages;
            this.pagesPrinted += pagesToPrint;
        }
        return  pagesToPrint;
    }
    
    public int getPagesPrinted(){
        return pagesPrinted;
    }
}
