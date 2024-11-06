package pizzaParty;

public class Main {
    public static void main(String[] args) {
        Pizza p = new Pizza();
        Customer.receivePizza(p); // Customer receives the pizza
        Friend.sharePizza(p);     // Friend shares the same pizza
    }
}
