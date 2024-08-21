// TestDecoratorPattern.java
public class TestDecoratorPattern {
    public static void main(String[] args) {
        // Create a basic email notifier
        Notifier emailNotifier = new EmailNotifier();

        // Add SMS functionality
        Notifier smsNotifier = new SMSNotifierDecorator(emailNotifier);

        // Add Slack functionality
        Notifier slackNotifier = new SlackNotifierDecorator(smsNotifier);

        // Send notification
        slackNotifier.send("Hello, Decorator Pattern!");
    }
}
