import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("enter the number");
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the num1");
        int a=sc.nextInt();
        System.out.println("enter the num2");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println(sum);

    }
}
