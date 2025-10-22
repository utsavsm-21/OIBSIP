import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User user = new User("user1", "pass123"); 

        boolean loggedIn = false;
        while(!loggedIn) {
            System.out.println("=== Login ===");
            System.out.print("Username: ");
            String uname = sc.nextLine();
            System.out.print("Password: ");
            String pwd = sc.nextLine();

            if(user.login(uname, pwd)) {
                loggedIn = true;
                System.out.println("Login successful! Welcome " + user.getUsername());
            } else {
                System.out.println("Invalid credentials! Try again.\n");
            }
        }

        while(true) {
            System.out.println("\n--- Main Menu ---");
            System.out.println("1. Update Password");
            System.out.println("2. Start Test");
            System.out.println("3. Logout");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch(choice) {
                case 1:
                    user.updatePassword(sc);
                    break;

                case 2:
                    Question[] qs = new Question[3];
                    qs[0] = new Question("What is 2 + 2?", new String[]{"3","4","5","6"}, 2);
                    qs[1] = new Question("Capital of India?", new String[]{"Delhi","Mumbai","Chennai","Kolkata"}, 1);
                    qs[2] = new Question("Java is ___?", new String[]{"Programming Language","Animal","Car","Movie"}, 1);

                    Test test = new Test(qs, 60); 
                    test.start(sc);
                    break;

                case 3:
                    System.out.println("Session closed. Logging out...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
