import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
      ArrayList<String>studentname=new ArrayList<>();
      studentname.add("aadesh");
      studentname.add("bikesh");
      studentname.add("nikhil");
      studentname.add("rajbir");
      System.out.println(studentname);
      studentname.add("ram");
      System.out.println(studentname);
      //using remove function to remove object aadesh from the student name list
      studentname.remove("aadesh");
      System.out.println(studentname);
      //using set function 
      studentname.set(0,"aadeshyadav");
      System.out.println(studentname);
      //using contain function to check wheather the student name is contain in list or not
     studentname.contains("aadesh");
     System.out.println(studentname);
      //using clear function to clear all the studentname 
      studentname.clear();
      System.out.println(studentname);

    }
}
