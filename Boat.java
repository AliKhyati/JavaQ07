public class Boat extends Vehicle {

    public Boat(String firstname, int kilometers){
        super(firstname, kilometers);
    }
    @Override
    public String doStuff() {
        return "I am " + brand + " and i go glug glug!";
    }
}
