public class App {
    public static void main(String[] args) throws Exception {
     int a = 5;
     int b = 10;
     System.out.println("before swapping number");
     System.out.println("show number a=" +a);
     System.out.println("show number b=" +b);
     int temp = a;
     a = b;
     b = temp;
     System.out.println("After swapping number");
     System.out.println("show number a=" +a);
     System.out.println("show number b=" +b);
    }
}
