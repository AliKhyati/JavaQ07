public class Hangar {
    public static void main(String[] args) {
        Car car = new Car("clio", 100);
        Boat boat = new Boat("Queen Elizabeth 2", 200);

        System.out.println(car.doStuff() + boat.doStuff());
    }
}
