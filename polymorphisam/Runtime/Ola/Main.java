package polymorphisam.Runtime.Ola;

public class Main {
    public static void main(String[] args) {
        Auto a = new Auto();
        Bike b = new Bike();
        Car c = new Car();

        Stimulator.vehRide(b);

    }
}

