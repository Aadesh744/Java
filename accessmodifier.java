
class student {
public String name;
protected String email; 
}
public class accessmodifier {
    public static void main(String[] args) throws Exception {
        student s1 =new student();
        s1.name="aadesh";
        s1.email="aadeshy744@gmail.com";
        System.out.println("the name is:"+s1.name);
        System.out.println("the gmail is:"+s1.email);
    }



}
