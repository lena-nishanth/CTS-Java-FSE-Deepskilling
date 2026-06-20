public class Main {
    public static void main(String[] args) {

        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Phone", "Electronics"),
                new Product(103, "Shoes", "Fashion"),
                new Product(104, "Watch", "Accessories"),
                new Product(105, "Bag", "Travel")
        };

        int searchId = 103;

        Product result1 = SearchOperations.linearSearch(products, searchId);

        if (result1 != null) {
            System.out.println("Linear Search Result");
            result1.display();
        } else {
            System.out.println("Product Not Found");
        }

        Product result2 = SearchOperations.binarySearch(products, searchId);

        if (result2 != null) {
            System.out.println("Binary Search Result");
            result2.display();
        } else {
            System.out.println("Product Not Found");
        }
    }
}