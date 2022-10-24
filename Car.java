public class Car extends Vehicle{

    public Car(String firstname, int kilometers){
        super(firstname, kilometers);
    }

    @Override
    public String doStuff() {
        return "I am " + brand + " and i go zoom zoom!";
    }
}
