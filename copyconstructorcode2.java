class aadesh{
    String name;
    double regno;
    aadesh(String name,double regno){
        this.name=name;
        this.regno=regno;
    }
    aadesh(aadesh b1){
        this.name=b1.name;
        this.regno=b1.regno;
    }
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.regno);
    }
    
}

public class copyconstructorcode2{
    public static void main(String[] args) throws Exception {
        aadesh a1=new aadesh("ram",211);
           aadesh b2=new aadesh(a1);
              //calling the function
              a1.printInfo();
              b2.printInfo();

             }
                }
