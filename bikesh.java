class Aadesh{
    String name;
    String course;
    int year;
    public Aadesh(String name, String course, int year){
        this.name=name;
        this.course=course;
        this.year=year;
        }

    public void printName(){
        System.out.println(this.name);
    }
    public void printCourse(){
        System.out.println(this.course);
    }
    public void printYear(){
        System.out.println(this.year);
    }
}





public class bikesh {
    public static void main(String[] args) throws Exception {
    Aadesh A1 = new Aadesh("aadesh","CSE",2);
    A1.printName();
    A1.printCourse();
    A1.printYear();
    }
}