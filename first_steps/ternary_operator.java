package first_steps;
public class ternary_operator{
    public static void main(String[] args){
        boolean a= true;
        boolean b= false;

        boolean c= a ? true : false;
        boolean d= b ? true : false; //we can reverse the the place of true and false also
        
        System.out.println(c);
        System.out.println(d);

        if (c){
            System.out.println("hello");
        }
        if (d){
            System.out.println("hi");
        }
    }
}