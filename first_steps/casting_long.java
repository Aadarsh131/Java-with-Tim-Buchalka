package first_steps;
public class casting_long{  
    public static void main(String args[]){  
    int i=100;  
    Long l= new Long(i) ;//first way  
    Long l2=Long.valueOf(i);//second way  
    System.out.println(l);  
    System.out.println(l2);  
    }
}  