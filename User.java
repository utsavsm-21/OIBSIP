import java.util.Scanner;
public class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean login(String u, String p) {
        return username.equals(u) && password.equals(p);
    }

    public void updatePassword(Scanner sc) {
        System.out.print("Enter new password: ");
        password = sc.nextLine();
        System.out.println("Password updated successfully!");
    }

    public String getUsername() {
        return username;
    }
}
