public class ArrayExample {
    public static void main(String[] args) {
         int[] numbers = {10, 20, 30, 40, 50};
         System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
    }
}