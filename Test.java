import java.util.Scanner;
public class Test {
    private Question[] questions;
    private int duration; 
    public Test(Question[] questions, int duration) {
        this.questions = questions;
        this.duration = duration;
    }

    public void start(Scanner sc) {
        System.out.println("\nTest Started! Time: " + duration + " seconds");
        int score = 0;
        long startTime = System.currentTimeMillis();

        for (Question q : questions) {
            if ((System.currentTimeMillis() - startTime) / 1000 >= duration) {
                System.out.println("\nTime over! Auto-submitting...");
                break;
            }
            q.display();
            System.out.print("Enter answer (1-" + q.getOptions().length + "): ");
            int ans = sc.nextInt();
            sc.nextLine(); 

            if (q.checkAnswer(ans)) score++;
        }

        System.out.println("\nTest completed! Score: " + score + "/" + questions.length);
    }
}
