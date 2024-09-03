public class ControlStatementsExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
           
            if (i % 2 == 0) {
                System.out.println(i + " is even.");
            } else {
                System.out.println(i + " is odd.");
            }
        }
        int counter = 1;
        System.out.println("\nUsing while loop to print numbers greater than 5:");
        while (counter <= 10) {
            if (counter > 5) {
                System.out.println(counter + " is greater than 5.");
            }
            counter++;
        }
    }
}
