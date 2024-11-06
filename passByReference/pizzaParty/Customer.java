package pizzaParty;

public class Customer {
    static void receivePizza(Pizza p) {
        p.deliver();
        System.out.println("Customer is enjoying the pizza!");
    }
}
