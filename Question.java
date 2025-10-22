public class Question {
    private String question;
    private String[] options;
    private int correctAnswer;

    public Question(String q, String[] o, int ans) {
        question = q;
        options = o;
        correctAnswer = ans;
    }

    public void display() {
        System.out.println("\n" + question);
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
    }

    public boolean checkAnswer(int ans) {
        return ans == correctAnswer;
    }

    public String[] getOptions() {
        return options;
    }
}
