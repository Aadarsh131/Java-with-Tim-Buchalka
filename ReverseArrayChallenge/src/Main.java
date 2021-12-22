import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {3,4,2,5,7};
        System.out.println(Arrays.toString(array));
        reverse(array);
        System.out.println(Arrays.toString(array));
    }

    public static void reverse(int[] array){
        int[] reverseArr = new int[array.length];
        for(int i=array.length;i>0; i--){
            reverseArr[i-1] = array[array.length - i];
        }

        for(int i=0; i<array.length; i++){
            array[i] = reverseArr[i];
        }

    }
}


