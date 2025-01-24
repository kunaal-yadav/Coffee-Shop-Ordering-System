import javafx.scene.paint.Color;

/**
 * Class representing a Mug, a non-consumable product at Tim Hortons.
 * @author Kunal Yadav
 * @version 2024
 */
public class Mug extends TimsProduct {
    private Color color;
    private String description;

    /**
     * Private constructor for Mug.
     * @param name The name of the mug.
     * @param desc The description of the mug.
     * @param color The color of the mug.
     * @param cost The production cost of the mug.
     * @param price The retail price of the mug.
     */
    private Mug(String name, String desc, Color color, double cost, double price) {
        super(name, cost, price);
        this.color = color;
        this.description = desc;
    }

    /**
     * Gets the color of the mug.
     * @return The color of the mug.
     */
    public Color getColor() {
        return color;
    }

    /**
     * Static method to create a Mug instance.
     * @return A new Mug object.
     */
    public static Mug create() {
        double cost = 1.00;
        double price = 1.50;
        String name = "Mug";
        String desc = "A large red mug for beverages";
        return new Mug(name, desc, Color.RED, cost, price);
    }

    @Override
    public String toString() {
        return getName() + " : " + description + " : $" + String.format("%.2f", getRetailPrice());
    }
}
