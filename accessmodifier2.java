
class student {
    public String name;
    protected String email; 
    }
    class bikesh extends student{
        
    }
    public class accessmodifier2 {
        public static void main(String[] args) throws Exception {
            student s1 =new student();
            s1.name="aadesh";
            s1.email="aadeshy744@gmail.com";
          
        
        bikesh b1 = new bikesh();
         System.out.println("the gmail is:"+s1.email);
           System.out.println("the name is:"+s1.name);
            
        }
    
    
    
    
    }


