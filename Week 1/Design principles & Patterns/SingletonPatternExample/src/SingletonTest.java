public class SingletonTest {

    public static void main(String[] args) {

        // Get the first Logger object
        Logger log1 = Logger.getInstance();

        // Get the second Logger object
        Logger log2 = Logger.getInstance();

        // Display log messages
        log1.log("Application started");
        log2.log("User logged in");

        // Check whether both objects are the same
        if (log1 == log2) {
            System.out.println("Only one Logger object is created.");
        } else {
            System.out.println("More than one Logger object is created.");
        }
    }
}