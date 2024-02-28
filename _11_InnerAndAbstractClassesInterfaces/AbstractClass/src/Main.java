public class Main {
    /*There are two ways to achieve abstraction in java
        1. Abstract class (0 to 100%)
        2. Interface (100%)
    */


    public static void main(String[] args) {
//        Bike myBike = new Bike();
            Bike myBike = new Honda();
            myBike.run();
            myBike.changeGear();

        System.out.println("----".repeat(20));
            myBike = new Kawasaki();
            myBike.run();
            myBike.changeGear();
    }
}

//Example of an abstract class that has abstract and non-abstract methods
abstract class Bike{
    Bike(){System.out.println("bike is created");}
    abstract void run();
    void changeGear(){System.out.println("gear changed");}
}
//Creating a Child class which inherits Abstract class
class Honda extends Bike{
    void run(){System.out.println("running Honda safely..");}
}

class Kawasaki extends Bike{
    void run(){
        System.out.println("rigorously running the kawasaki on the race track");
    }
}