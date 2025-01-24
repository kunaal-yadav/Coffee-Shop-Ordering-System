/**
 * Class representing a GiftCard, a non-consumable product at Tim Hortons.
 * @author Kunal Yadav
 * @version 2024
 */
public class TimsGiftCard extends TimsProduct {
    private double balance;
    private String description;

    /**
     * Private constructor for TimsGiftCard.
     * @param name The name of the gift card.
     * @param balance The balance on the gift card.
     * @param cost The production cost of the gift card.
     * @param price The retail price of the gift card.
     * @param desc The description of the gift card.
     */
    private TimsGiftCard(String name, double balance, double cost, double price, String desc) {
        super(name, cost, price);
        this.balance = balance;
        this.description = desc;
    }

    /**
     * Gets the balance on the gift card.
     * @return The balance on the gift card.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Static method to create a TimsGiftCard instance.
     * @return A new TimsGiftCard object.
     */
    public static TimsGiftCard create() {
        double balance = 25.00;
        double cost = 0.00;
        double price = 25.00;
        String name = "Gift Card";
        String desc = "A $25 Tim Hortons gift card";
        return new TimsGiftCard(name, balance, cost, price, desc);
    }

    @Override
    public String toString() {
        return getName() + " : " + description + " : $" + String.format("%.2f", getRetailPrice());
    }
}
