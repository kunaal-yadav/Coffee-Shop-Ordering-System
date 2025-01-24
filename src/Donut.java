import javafx.scene.paint.Color;

/**
 * Class representing a Donut, a consumable product at Tim Hortons.
 * @author Kunal Yadav
 * @version 2024
 */
public class Donut extends TimsProduct implements Consumable {
    private Color color;
    private String description;
    private int calorieCount;

    /**
     * Private constructor for Donut.
     * @param name The name of the donut.
     * @param desc The description of the donut.
     * @param calorieCount The calorie count of the donut.
     * @param cost The production cost of the donut.
     * @param price The retail price of the donut.
     */
    private Donut(String name, String desc, int calorieCount, double cost, double price) {
        super(name, cost, price);
        this.description = desc;
        this.calorieCount = calorieCount;
        this.color = Color.BROWN; // Assuming a default color
    }

    /**
     * Gets the color of the donut.
     * @return The color of the donut.
     */
    public Color getColor() {
        return color;
    }

    /**
     * Gets the calorie count of the donut.
     * @return The calorie count of the donut.
     */
    @Override
    public int getCalorieCount() {
        return calorieCount;
    }

    /**
     * Static method to create a Donut instance.
     * @return A new Donut object.
     */
    public static Donut create() {
        double cost = 0.40;
        double price = 1.25;
        String name = "Donut";
        String desc = "Honey Dip";
        int calories = 240;

        return new Donut(name, desc, calories, cost, price);
    }

    @Override
    public String toString() {
        return getName() + " : " + description + " , " + calorieCount + " calories : $" + String.format("%.2f", getRetailPrice());
    }
}
