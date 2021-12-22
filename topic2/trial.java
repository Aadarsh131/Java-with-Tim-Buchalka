package topic2;
// i am being called by the main fucntion from 'Main' file

public class trial {
    
    public static int newmethod(int a){
        return a;
    }
    
    public static int callingSameMethod(int number){
        
        while(number!=0){
            System.out.println("hi");
            number-=1;
            return callingSameMethod(number);
        }
        return number;
        
    }
}
