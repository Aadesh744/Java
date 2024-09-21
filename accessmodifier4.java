class Account { 
    private String accountholder;
    private int remainingAmount; 
    private String password;

    // using getter 
    public String getPassword() { 
        return this.password;
    }

    // using setter 
    public void setPassword(String password) { 
        this.password = password;
    }
        
    // using getter
    public String getAccountholder() { 
        return this.accountholder;
    }
    
    // using setter
    public void setAccountholder(String accountholder) { 
        this.accountholder = accountholder;
    }
}

public class accessmodifier4 { 
    public static void main(String[] args) throws Exception {
        Account a1 = new Account(); 
        a1.setPassword("aadesh"); 
        System.out.println(a1.getPassword());
        
        Account a2 = new Account(); 
        a2.setAccountholder("bikesh"); 
        System.out.println(a2.getAccountholder());
    }
}







