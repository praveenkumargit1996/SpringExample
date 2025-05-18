package com.example.autowire.type;

public class Car {

    private Specification specification;

    // passing the arguments to setter through auto-wiring .
    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    public void displayDetails(){
        System.out.println(" Car details: " + specification.toString() );
    }


}
