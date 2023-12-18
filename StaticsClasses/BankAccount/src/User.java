import java.util.Arrays;
import java.util.List;

public class User {
    private String fullName;
    private String password;


    public User(String fullName, String password) {
        this.fullName = fullName;
        this.password = password;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public static List<User> users()
    {
        List<User> uList = Arrays.asList(
          new User("Ahmet Yıldırım", "123"),  
          new User("Kaan Şahin", "432"),  
          new User("Musa Güngör", "234") 
        );

        return uList;
    }

    public static User findUser(String name, String password)
    {
        List<User> users = User.users();
        for (User user : users) {
            if (user.getFullName().equals(name) && user.getPassword().equals(password)) {
                    return user;
            }
           
        }
        return null;
    }
}
