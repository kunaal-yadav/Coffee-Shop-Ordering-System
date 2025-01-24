/**
 * Class representing a Muffin, a consumable product at Tim Hortons.
 * @author Kunal Yadav
 * @version 2024
 */
public class Muffin extends TimsProduct implements Consumable {
    private String description;
    private int calorieCount;

    /**
     * Private constructor for Muffin.
     * @param name The name of the muffin.
     * @param desc The description of the muffin.
     * @param calorieCount The calorie count of the muffin.
     * @param cost The production cost of the muffin.
     * @param price The retail price of the muffin.
     */
    private Muffin(String name, String desc, int calorieCount, double cost, double price) {
        super(name, cost, price);
        this.description = desc;
        this.calorieCount = calorieCount;
    }

    /**
     * Gets the calorie count of the muffin.
     * @return The calorie count of the muffin.
     */
    @Override
    public int getCalorieCount() {
        return calorieCount;
    }

    /**
     * Static method to create a Muffin instance.
     * @return A new Muffin object.
     */
    public static Muffin create() {
        double cost = 0.50;
        double price = 1.75;
        String name = "Muffin";
        String desc = "Blueberry Muffin";
        int calories = 300;

        return new Muffin(name, desc, calories, cost, price);
    }

    @Override
    public String toString() {
        return getName() + " : " + description + " , " + calorieCount + " calories : $" + String.format("%.2f", getRetailPrice());
    }
}
