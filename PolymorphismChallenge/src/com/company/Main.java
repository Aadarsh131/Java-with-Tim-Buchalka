package com.company;

class Car {
    private String name;
    private Boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders, int wheels){
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = wheels;
        this.engine = true;
    }

    public void StarEngine(){
        System.out.println(getClass().getSimpleName()+" engine started");
        // getClass() will check which class we are in
        // then, getSimpleName() will fetch the name of that class
    }

    public void accelerate(){
        System.out.println("got accelerated");
    }

    public void brake(){
        System.out.println("applied brake");
    }

    public String getName(){
        return name;
    }
    public int getCylinders(){
        return cylinders;
    }

    public int getWheels(){
        return wheels;
    }
}


class Bmw extends Car{

    public Bmw(String name, int cylinders, int wheels) {
        super(name, cylinders, wheels);
    }

    @Override
    public void StarEngine() {
        System.out.println("Starting " +getClass().getSimpleName()+" engine");
        // getClass() will check which class we are in
        // then, getSimpleName() will fetch the name of that class
    }

    @Override
    public void accelerate() {
        super.accelerate();
    }

    @Override
    public void brake() {
        super.brake();
    }
}







public class Main {

    public static void main(String[] args) {
	Car car = new Car("vehicle", 4,4);
    car.StarEngine();
    car.accelerate();
    car.brake();

    Bmw bmw = new Bmw("BMW",8,6);
    bmw.StarEngine();
    bmw.accelerate();
    bmw.brake();

    }
}
