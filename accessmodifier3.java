class account{
    String accountholder;
    int accountnumber;
    private String password;
    //using getter 
    public  String getpassword(){
        return this.password;
    }
    //using setter 
    public void setpassword(String password){
        this.password=password;
    }

}

public class accessmodifier3 {
    public static void main(String[] args) throws Exception {
        account a1=new account();
        a1.setpassword("aadesh");
        System.out.println(a1.getpassword());
    }
}
