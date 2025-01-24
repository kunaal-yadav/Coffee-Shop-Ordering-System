import java.util.Scanner;

/**
 * Class representing a Tim Hortons order.
 * @author Kunal Yadav
 * @version 2024
 */
public class TimsOrder {
    private String name;
    private int numItems;
    private TimsProduct[] items;

    /**
     * Constructor for TimsOrder.
     * @param name The name of the customer.
     * @param numItems The number of items in the order.
     */
    public TimsOrder(String name, int numItems) {
        this.name = name;
        this.numItems = numItems;
        items = new TimsProduct[numItems];
    }

    /**
     * Static method to create a TimsOrder by interacting with the user.
     * @return A new TimsOrder object.
     */
    public static TimsOrder create() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Tim Hortons");
        System.out.println("What is your name?");
        String name = sc.nextLine();

        System.out.println("How many items are you going to order?");
        int numItems = Integer.parseInt(sc.nextLine());

        TimsOrder order = new TimsOrder(name, numItems);
        for (int i = 0; i < numItems; i++) {
            System.out.println("What can I get you?");
            System.out.println("(item choices: Mug, Donut, Muffin, GiftCard)>");
            String code = sc.nextLine();
            switch (code.toLowerCase()) {
                case "mug":
                    order.items[i] = Mug.create();
                    break;
                case "donut":
                    order.items[i] = Donut.create();
                    break;
                case "muffin":
                    order.items[i] = Muffin.create();
                    break;
                case "giftcard":
                    order.items[i] = TimsGiftCard.create();
                    break;
                default:
                    System.out.println("Invalid item type.");
                    i--; // to retry this item
                    break;
            }
        }

        System.out.println("Order complete. Thank you!");
        return order;
    }

    /**
     * Method to calculate the total amount due for the order.
     * @return The total amount due.
     */
    public double getAmountDue() {
        double sum = 0;
        for (TimsProduct p : items) {
            sum += p.getRetailPrice();
        }
        return sum;
    }

    @Override
    public String toString() {
        // Start with the order details
        String str = name.toUpperCase() + "'s Order: Number of Items: " + numItems + "\n";
        for (TimsProduct p : items) {
            str += p.toString() + "\n";
        }
        return str;
    }
}
