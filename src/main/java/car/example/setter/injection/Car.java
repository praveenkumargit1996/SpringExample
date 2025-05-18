package car.example.setter.injection;

public class Car {

    private Specification specification;

    // passing the arguments to Setter() through constructor injection .
    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    public void displayDetails(){
        System.out.println(" Car details: " + specification.toString() );
    }

}
