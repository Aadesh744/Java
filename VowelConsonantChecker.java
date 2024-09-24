import java.util.Scanner;

public class VowelConsonantChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a single character: ");
        String input = scanner.next();

        if (input.length() == 1) {
            char character = input.charAt(0);
            if (Character.isLetter(character)) {
                character = Character.toLowerCase(character);
                if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
                    System.out.println(character + " is a vowel.");
                } else {
                    System.out.println(character + " is a consonant.");
                }
            } else {
                System.out.println("Invalid input. Please enter a letter.");
            }
        } else {
            System.out.println("Invalid input. Please enter exactly one character.");
}
}
}