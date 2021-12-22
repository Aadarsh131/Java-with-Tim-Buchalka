package topic2;

public class methods{
    public static void main(String[] args){
        long id=201810100025L;
        boolean fees_paid= true;
        int fees=2000000;

        int d=discount(id,fees_paid,fees);
        System.out.println(d);

    }

    public static int discount(long a,boolean b, int c  ){
        if(b){
            return c-=20000;
        }
        return -1;
    }
}


