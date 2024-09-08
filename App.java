class Student{
    String name;
    int age;
    //Creating function 
    public void printinfo(String name){
      System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name,int age){
        System.out.println(name+" "+age);
    }

}


public class App {
    public static void main(String[] args) throws Exception {
        Student s1= new Student();
        s1.name="aadesh";
        s1.age=20;
        s1.printInfo(s1.age);
        s1.printInfo(s1.name,s1.age);


       
    }
}
