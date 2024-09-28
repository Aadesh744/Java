
      import java.util.ArrayList;
      import java.util.Scanner;
      
       public class AddElementsInList {
        public static void main(String[] args) {
            ArrayList<String>list= new ArrayList<>();
        Scanner sc =new Scanner(System.in);

        System.out.print("enter the number of elements you like to add in arraylist:");
        int n= sc.nextInt();
        sc.nextLine();

        for(int i=0;i<n;i++){
            System.out.print("Enter element "+ (i+1) +  " : ");
            String element =sc.nextLine();
            list.add(element);
           }
        System.out.print("the elements are :"+list);


    }
}
       
        
       

    

