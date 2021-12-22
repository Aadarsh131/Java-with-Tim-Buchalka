package topic2;

public class method_overloading {
    public static void main(String[] args){
        System.out.println(returnName("Aadarsh"));
        System.out.println(returnName("kumar",201810100025L));
        System.out.println(returnName("shah",201810100025L,10));
    }

    public static String returnName(String name){
        return name;
    }

    public static String returnName(String name,long id){
        return name;
    }
    public static String returnName(String name,long id, int roll){
        return name;
    }
    // the unique signature here distinguishing all methods
    // is the different parameters.
    // NOTE- the same method(with same parameters) with different
    // return type is not applicable in method overloading. 

}
