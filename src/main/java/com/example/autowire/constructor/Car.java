package com.example.autowire.constructor;

public class Car {

    private Specification specification;

    // passing the arguments to constructor through auto-wiring.
    public Car(Specification specification) {
        this.specification = specification;
    }

    public void displayDetails(){
        System.out.println(" Car details: " + specification.toString() );
    }

}
