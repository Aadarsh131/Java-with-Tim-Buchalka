package _3.First_Steps;
public class whythisisso {
    public static void main(String[] args){
        int a=5;
        if(a==5){ //this is comparison operator and assignement operator
                  //wont works here because of the below commented reason
            System.out.println("hello");
        }

        boolean b= false;
        if(b=true){ 
            System.out.println("hi");
            System.out.println(b);
        }
    }
    //the reason line 9 is working with assignment operator is because
    //if() asks for a boolean value by default 
    //here, if() finds a boolean value so the code works fine
    //also here, b is assigned to true
}
