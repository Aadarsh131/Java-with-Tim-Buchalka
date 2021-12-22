package topic2;

public class SecondAndMinuteChallenge {
    public static void main(String[] args){
        String time=getDurationString(365642);
        System.out.println(time);
    }

    public static String getDurationString(int minutes, int seconds){
        if(minutes>=0 && seconds>=0 && seconds<=59){
            int hours= minutes/60;
            int remainingMinutes=minutes%60;
            return hours+"h "+remainingMinutes+"m "+seconds+"s";
        }
        else
            return "Invalid Value";
    }
    
    public static String getDurationString(int seconds){
        if(seconds>=0){
            int minutes=seconds/60;
            int remainingSeconds=seconds%60;
            return getDurationString(minutes,remainingSeconds);
            //when we are returning and calling the method at the 
            //same time the method return type should be same 
            //for both the methods.
        }
        else return "Invalid Value";
    }
    
    
}
