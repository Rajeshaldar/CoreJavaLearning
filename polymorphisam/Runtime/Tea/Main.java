package polymorphisam.Runtime.Tea;

public class Main {
    public static void main(String[] args) {
        LemonTea lemonTea = new LemonTea();
        GreenTea greenTea = new GreenTea();
        BlackTea blackTea = new BlackTea();

        Stimulator.tasteTea(lemonTea);
        
    }
}
