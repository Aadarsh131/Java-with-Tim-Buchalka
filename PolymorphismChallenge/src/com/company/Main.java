package com.company;

class Car {
    private String name;
    private String carType;

    protected Car(String name) {
        this.name = name;
        this.carType = this.getClass().getSimpleName();
    }

    protected void description() {
        System.out.println(this.name + " (type: " + carType + ")");
    }

    protected void startEngine() {
        System.out.println("starting " + this.getClass().getSimpleName() + "'s Engine");
    }

    protected String getName() {
        return this.name;
    }

    protected String getCarType() {
        return this.carType;
    }

    //FACTORY METHOD
    public static Car selectCarForRide(int n) {
        return switch (n) {
            case 1 -> new ElectricCar("myElectricCar");
            case 2 -> new HybridCar("myHybridCar", true);
            default -> new GasPowerdCar("myGasCar");
        };
    }
}


class ElectricCar extends Car {
    public ElectricCar(String name) {
        super(name);
    }

    public void rechargeTheBattery() {
        System.out.println("Charging the battery");
    }
}

class GasPowerdCar extends Car {
    public GasPowerdCar(String name) {
        super(name);
    }

    public void fuelUpTheTank() {
        System.out.println("Fuelling the Tank");
    }

}

class HybridCar extends Car {
    private Boolean modeElectric = false;
    private Boolean modeGas = false;

    public HybridCar(String name, Boolean electricMode) {
        super(name);
    }

    public void rechargeOrReFuel() { //default mode is `modeGas`
        if (this.modeElectric) System.out.println("recharging the hybrid car");
        else System.out.println("Fuelling the hybrid car Tank");
    }

    public void setModeGas() {
        this.modeGas = true;
        this.modeElectric = false;
    }

    public void setModeElectric() {
        this.modeElectric = true;
        this.modeGas = false;
    }
}


public class Main {

    public static void main(String[] args) {
        HybridCar myHybridCar = new HybridCar("Nexon", true);
        System.out.println(myHybridCar.getCarType());
//        myHybridCar.setModeElectric();
//        myHybridCar.setModeGas();
        myHybridCar.rechargeOrReFuel();


        //example of Polymorphism
        var myCar = Car.selectCarForRide(3);
        if (myCar instanceof ElectricCar e) e.rechargeTheBattery();
        else if (myCar instanceof HybridCar h) h.rechargeOrReFuel();
        else ((GasPowerdCar) myCar).fuelUpTheTank();
    }
}
