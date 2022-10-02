package PizzaPastaOrderingSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DriverClass {
    static Scanner obj = new Scanner(System.in);
    static CustomerInfo customer = new CustomerInfo("Amit Singh",894984010);
    public static void main(String[] args){

        System.out.println("Select what Menu you want to Order from Menu Items Available:");
        AvailableMenu menu = new AvailableMenu();
        menu.getMenu();
        
        Kitchen kitchen = new Kitchen();
        OrderingSystem orderingSystem = new OrderingSystem(customer);
        PaymentStatus payment = new PaymentStatus(false);

        int option;
        do{
            System.out.println("Enter which item you want to order Pizza or Pasta?");
            System.out.println("Enter 1 for Pizza and 2 for Pasta");
            option = obj.nextInt();
            AcceptOrders(option);
        }while(option<3);
        
        orderingSystem.setCustomerDetails(customer);
        
        System.out.println("You Bill for Meal:");
        System.out.println(orderingSystem.OrderSummary());
        System.out.println("Payment Status");
        payment.setSendMoney(true);
        customer.setPayment(payment);
        System.out.println("Thank You for Visiting, Have a Nice Day");
    }

    public static void AcceptOrders(int option){
        switch(option){
            case 1:{
                System.out.println("PIZZA");
                System.out.println("Select flavour, which flavour you want: Vegetarian, NonVeg, Vegan");
                String flavour = obj.next();
                System.out.println("Enter Size of the Pizza: Large, Medium, Small");
                String size = obj.next();
                System.out.println("Choose crust for your Order: Thick, Thin");
                String crust = obj.next();
                System.out.println("Add Toppings?: yes or No");
                String addToppings = obj.next();
                List<Toppings> toppings = new ArrayList<>();

                if(addToppings.equals("Yes")){
                    System.out.println("How many Toppings you want to add?");
                    int num = obj.nextInt();

                    System.out.println("Add toppings as per Pizza");
                    for(int i=0;i<num;i++){
                        String topping = obj.next();
                        toppings.add(Toppings.valueOf(topping));
                    }
                }
                OrderRequest order = new OrderRequest();
                System.out.println("Total Quantity of Items?");
                int quantity = obj.nextInt();
                PizzaOrder pizzaOrder = new PizzaOrder(PizzaSize.valueOf(size),PizzaCrust.valueOf(crust),
                                                       PizzaFlavour.valueOf(flavour),toppings,quantity);
                order.setPizzaOrder(pizzaOrder);
                customer.addOrder(order);
                break;
            }
            case 2:{
                System.out.println("PASTA");
                System.out.println("Enter flavour of your Pasta: Red-Sauce,White-Sauce");
                String flavour = obj.next();
                System.out.println("Select type of Pizza: Penne, Ditalini");
                String type = obj.next();

                OrderRequest order = new OrderRequest();
                System.out.println("Total Quantity of Items?");
                int quantity = obj.nextInt();
                PastaOrder pastaOrder = new PastaOrder(PastaFlavour.valueOf(flavour),PastaTypes.valueOf(type),quantity);
                order.setPastaOrder(pastaOrder);
                customer.addOrder(order);
                break;
            }
            default:
                break;
        }
    }
}
