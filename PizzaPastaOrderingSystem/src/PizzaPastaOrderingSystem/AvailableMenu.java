package PizzaPastaOrderingSystem;

public class AvailableMenu {

    public void getMenu(){
        System.out.println("Pizza Details");
        System.out.println("Pizza Sizes Available: Large Medium Small");
        System.out.println("Pizza flavours Available: ");
        System.out.println("1.Vegetarian Pizza: a) Small : $20 \t b) Medium : $40 \t c) Large : $60");
        System.out.println("1.Vegetarian Pizza: a) Small : $25 \t b) Medium : $50 \t c) Large : $75");
        System.out.println("1.Vegetarian Pizza: a) Small : $15 \t b) Medium : $30 \t c) Large : $45");
        System.out.println("Different Toppings available that cost extra $1");
        System.out.println(Toppings.Cheese);
        System.out.println(Toppings.Mushroom);
        System.out.println(Toppings.Tomato);
        System.out.println(Toppings.Jalapeno);
        System.out.println(Toppings.Spinach);
        System.out.println();

        System.out.println("Pasta Details");
        System.out.println("Pizza Flavours Available: ");
        System.out.println("1.Red Sauce Pasta : $10");
        System.out.println("2.White Sauce Pasta : $20");
        System.out.println("Types of Pizza Available");
        System.out.println(PastaTypes.Penne.toString() + "\n" + PastaTypes.Ditalini.toString());
    }
}
