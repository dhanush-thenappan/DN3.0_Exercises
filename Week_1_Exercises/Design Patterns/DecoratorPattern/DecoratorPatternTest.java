public class DecoratorPatternTest {
    public static void main(String[] args) {
        // Create an email notifier
        Notifier emailNotifier = new EmailNotifier();

        // Decorate the email notifier with SMS and Slack notifications
        Notifier smsNotifier = new SMSNotifierDecorator(emailNotifier);
        Notifier slackNotifier = new SlackNotifierDecorator(smsNotifier);

        // Send a notification using the decorated notifiers
        slackNotifier.send("Hello! This is a test notification.");
    }
}
