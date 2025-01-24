/**
 * Test class to demonstrate creating and displaying a Tim Hortons order.
 * @author Kunal Yadav
 * @version 2024
 */
public class TestClass {
    public static void main(String[] args) {
        TimsOrder order = TimsOrder.create();
        System.out.println(order);
        System.out.printf("Total Amount Due: $%.2f\n", order.getAmountDue());
    }
}
