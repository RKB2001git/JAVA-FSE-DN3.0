public class Logger {
    private static Logger instance;

    // Private constructor to prevent instantiation
    private Logger() {}

    // Public method to provide access to the instance
    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Example method for logging
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
