package topic2;

public class challenge_method_overloading {
    public static void main(String[] args){
        double res1=calcFeetAndInchesToCentimeters(13,5);
        System.out.println(res1);
        double res2=calcFeetAndInchesToCentimeters(6);
        System.out.println(res2);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if(feet>=0 && inches>=0 && inches<=12){
            
            inches=inches+(feet*12);
            double cms= inches*2.54;
            return cms;
        }
        else return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches>=0){
            double feet= inches/12;
            return feet;
        }
        else return -1;
    }
    
}
