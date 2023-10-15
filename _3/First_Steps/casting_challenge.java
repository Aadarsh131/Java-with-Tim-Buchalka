package _3.First_Steps;
public class casting_challenge {
    public static void main(String[] args){
        byte a= 1;
        short b= 2;
        int c= 3;
        
        long d= 5000+ 10*(a+b+c);
        System.out.println(d);

        short s= (short) (10*(a+b+c));
        System.out.println(s);

    }
}
