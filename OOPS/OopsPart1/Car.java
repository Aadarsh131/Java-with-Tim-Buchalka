package OOPS.OopsPart1;
public class Car {
    //if we dont specify any values to the attributes, then the non-primitive types will store null as the value,
    // "null" meaning the attribute has a type, but no reference to an object
    private String make = "Mercedes";
    private String model = "Model-X";
    private String color = "Gray";
    private int doors = 4; //primitive datatypes are never null
    //NOTE: the difference between varibles defined outside the classes and inside the classes(fields in class) is
    // that, the fields/attributes in the class are assigned a default values, intrinsically by java, if not assigned
    // explicitly
    // booleans will be false by default
    // byte,short,int,long,char will be 0 by default
    // double,float will be 0.0 by default
    private boolean convertible = true;


    public Car(String make, String model, String color, int doors, boolean convertible) {
        System.out.println("Constructor with all params");
        this.make = make;
//        setMake(make); //we can also use a setter (using here for validation reason) NOTE: incase of inheritance,
//        setter method might not work
        //so, best practice is to not use setter to set values inside the constructor
        this.model = model;
        this.color = color;
        this.doors = doors;
        this.convertible = convertible;
    }

    public Car() {
//        this("Default make", "default model", "default color", 0, false); //will call the other constructor to set
        // the value
        // (just
        // like constructor delegation in c++)
        //But, no need to delegate in our case(as we want the defined default fiels/properties
        System.out.println("Empty constructor");
    }

    public String getMake() {
        return make;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setMake(String make) {
        if (!make.equalsIgnoreCase("tesla"))
            this.make = make;
        else {
            System.out.println("cannot be Tesla(cannot be an electric car)");
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void describleCar() {
        System.out.println(doors + "-Doors " + color + " " + make + " " + model + " " + (convertible ?
                "convertible"
                : "Not Convertible"));
    }
}
