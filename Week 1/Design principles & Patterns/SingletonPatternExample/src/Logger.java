public class Logger {

    // Stores the single object of Logger class
    private static Logger logger;

    // Private constructor so object cannot be created outside the class
    private Logger() {
        System.out.println("Logger object created");
    }

    // Returns the single Logger object
    public static Logger getInstance() {

        // Create object only if it does not exist
        if (logger == null) {
            logger = new Logger();
        }

        // Return the same object every time
        return logger;
    }

    // Method to display log messages
    public void log(String message) {
        System.out.println(message);
    }
}