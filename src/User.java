
import java.io.Serializable;

public class User extends Employee implements Serializable{
    private static final long serialVersionUID = 1002L;//to save data to the file 
    private String userPassword;//password of the user
    private String userUserName;//user name of the user
    private String userLevel;//admin , hr manager, hr assitant

    public User(String password, String userName, String position) {
        this.userPassword = password;
        this.userUserName = userName;
        this.userLevel = position;
    }
    public User(String password, String userName, String position, String name, int epfNum) {
        super(name, epfNum);
        this.userPassword = password;
        this.userUserName = userName;
        this.userLevel = position;
    }
    
    //getters setters for the user details
    public String getPassword() {
        return userPassword;
    }

    public void setPassword(String password) {
        this.userPassword = password;
    }



    public String getUserName() {
        return userUserName;
    }

    public void setUserName(String userName) {
        this.userUserName = userName;
    }

    public String getPosition() {
        return userLevel;
    }

    public void setPosition(String position) {
        this.userLevel = position;
    }
    
    
}
