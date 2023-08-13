public class Main {
    public static void printHello(){
        System.out.println("Hello from the static method");
    }
    public static void main(String[] args) {
//        Car mercedes = null;//a runtime exception error
        Car mercedes = new Car();
        mercedes.setMake("Tesla");
        System.out.println("Model: " + mercedes.getMake());
        System.out.println("Convertible: "+mercedes.isConvertible());
        mercedes.describleCar();

        System.out.println("--".repeat(50));
        Car audi = new Car("Audi","Strank-43","white",4,true);
        audi.describleCar();

        //static methods
        System.out.println("--".repeat(50));
        Main.printHello(); //static methods must be called with on Class name
    }
}