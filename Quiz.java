package project1;
import java.util.*;
class Question {
    String questionText;
    String[] options;
    int correctAnswer;
    Question(String questionText, String[] options, int correctAnswer) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }
}
public class Quiz {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Question> quizQuestions = new ArrayList<>();
        // Adding sample questions
        quizQuestions.add(new Question("Computer trojans are an example of ?", 
            new String[]{"1. computer worms", "2. network security devices", "3. spyware", "4. malware"}, 4));
        quizQuestions.add(new Question("Which programming language is used for Android development?",
            new String[]{"1. Python", "2. Java", "3. C++", "4. Ruby"}, 2));
        quizQuestions.add(new Question("What does the acronym DNS stand for?",
                new String[]{"1. domain name system","2. domain number system","3. domain network system","4. document network system"}, 1));
        quizQuestions.add(new Question("Which of these is not a peripheral, in computer terms?",
                new String[]{"1. mouse", "2. monitor", "3. keyboard", "4. motherboard"}, 4));
        quizQuestions.add(new Question("Which of these video game consoles was released in 1994?",
                new String[]{"1.playstation", "2. Xbox", "3. Atari 2600", "4. Nintendo Entertainment System"}, 1));
        quizQuestions.add(new Question("Which of these was the first microprocessor, developed in 1971?",
                new String[]{"1. Intel Pentium", "2. MOS Technology 6502", "3. Intel 4004", "4. Intel 8088"}, 3));
        quizQuestions.add(new Question("What operating system did Google develop?",
                new String[]{"1. BlackBerry OS", "2. iOS", "3. Android", "4. Windows"}, 3));
        quizQuestions.add(new Question("One byte is equivalent to how many bits?",
                new String[]{"1. 12", "2. 8", "3. 64", "4. 32"}, 2));
        quizQuestions.add(new Question("Which of these is not a computer language?",
                new String[]{"1. Hypertalk", "2. Ada", "3. Windows 2000", "4. COBOL"}, 3));
        quizQuestions.add(new Question("Which of these is not an example of malware?",
                new String[]{"1. computer worm", "2. spyware", "3. trojan", "4.pulg-in"}, 4));

        int score = 0;
        // Loop through questions
        for (Question q : quizQuestions) {
            System.out.println("\n" + q.questionText);
            for (String option : q.options) {
                System.out.println(option);
            }

            System.out.print("Enter your choice (1-4): ");
            int userAnswer = scanner.nextInt();

            if (userAnswer == q.correctAnswer) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong!");
            }
        }
        System.out.println("\nQuiz Over! Your score: " + score + "/" + quizQuestions.size());
        scanner.close();
    }
}
