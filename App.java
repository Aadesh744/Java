public class App{
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds.");
        } finally {
            System.out.println("This block always runs.");
        }

        try {
            int result = divide(10, 0); 
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }
    }

    public static int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }
}
