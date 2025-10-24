
public class MessageGenerator {

    /**
     * The main method is the entry point of the program.
     */
    public static void main(String[] args) {
        // Call our custom method, passing "Alice" as the argument.
        // The returned string is stored in the 'welcomeText' variable.
        String welcomeText = createWelcomeMessage("Alice");

        // Print the result to the console.
        System.out.println(welcomeText);
    }

    /**
     * Creates a personalized welcome message.
     *
     * @param name The name of the person to welcome.
     * @return A formatted welcome String.
     */
    public static String createWelcomeMessage(String name) {
        // Concatenate the strings and return the final message.
        return "Welcome, " + name + "!";
    }
}
