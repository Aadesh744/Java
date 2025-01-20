import java.util.Scanner;

public class Result {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter marks for Subject 1: ");
        int subject1 = scanner.nextInt();

        System.out.println("Enter marks for Subject 2: ");
        int subject2 = scanner.nextInt();

        System.out.println("Enter marks for Subject 3: ");
        int subject3 = scanner.nextInt();

        int total = subject1 + subject2 + subject3;
        double average = total / 3.0;

        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);

        if (average >= 90) {
            System.out.println("Grade: A");
        } else if (average >= 75) {
            System.out.println("Grade: B");
        } else if (average >= 50) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }
        scanner.close();
    }
}
