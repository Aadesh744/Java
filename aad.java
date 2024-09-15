class Student {
    String Name;
    String Course;
    int Year;

public void printName() {
    System.out.println(this.Name);
}
public void printCourse() {
    System.out.println(this.Course);
}
public void printYear() {
    System.out.println(this.Year);
}
}



public class aad {
    public static void main(String[] args) throws Exception {
        Student a1=new Student();

        a1.Name = "Bikesh Yadav";
        a1.Course = "CSE";
        a1.Year = 2;

        a1.printName();
        a1.printCourse();
        a1.printYear();
    }
}







