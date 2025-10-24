
/**
 * This class represents a store and contains the main method
 * to run our application. Here, we will create and manage our Product objects.
 */
public class Store {

    public static void main(String[] args) {
        // --- Create the first Product object ---
        // The 'new' keyword creates an actual instance of the Product class in memory.
        Product product1 = new Product();

        // Use dot notation to access and set the public fields of the product1 object.
        product1.name = "Gaming Mouse";
        product1.price = 79.99;
        product1.sku = "G502-XYZ";

        // --- Create a second, distinct Product object ---
        Product product2 = new Product();
        product2.name = "Mechanical Keyboard";
        product2.price = 129.50;
        product2.sku = "MK87-QW";

        // --- Print the details of each object to the console ---
        System.out.println("--- Product 1 Details ---");
        System.out.println("Name: " + product1.name);
        System.out.println("Price: $" + product1.price);
        System.out.println("SKU: " + product1.sku);

        System.out.println(); // Add a blank line for readability

        System.out.println("--- Product 2 Details ---");
        System.out.println("Name: " + product2.name);
        System.out.println("Price: $" + product2.price);
        System.out.println("SKU: " + product2.sku);
    }
}
