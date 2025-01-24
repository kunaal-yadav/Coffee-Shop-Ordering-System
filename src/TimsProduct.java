/**
 * Abstract class representing a product at Tim Hortons.
 * @author Kunal Yadav
 * @version 2024
 */
public abstract class TimsProduct {
    private String name;
    private double cost;
    private double price;

    /**
     * Constructor for TimsProduct.
     * @param name The name of the product.
     * @param cost The production cost of the product.
     * @param price The retail price of the product.
     */
    public TimsProduct(String name, double cost, double price) {
        this.name = name;
        this.cost = cost;
        this.price = price;
    }

    /**
     * Gets the name of the product.
     * @return The name of the product.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the production cost of the product.
     * @return The production cost of the product.
     */
    public double getProductionCost() {
        return cost;
    }

    /**
     * Gets the retail price of the product.
     * @return The retail price of the product.
     */
    public double getRetailPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + ": $" + String.format("%.2f", getRetailPrice());
    }
}
