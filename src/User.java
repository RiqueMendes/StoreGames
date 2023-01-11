public class User {
    

    String password;
    String userName;


    public boolean AccVerify (String x, String y) {
       
       if( x == userName && y == password ){
        
        System.out.println("Success!");
        return true;

       }else
            System.out.println("\n Declined Access!\n Please Try Again");
            return false;
            
    }


    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
    }


    public String getUserName() {
        return userName;
    }


    public void setUserName(String userName) {
        this.userName = userName;
    }

    
}
