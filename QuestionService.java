import java.util.Scanner;

public class QuestionService {

    Questions[] questionObj = new Questions[5];
    int totalScore = 0;

    QuestionService() {
        questionObj[0] = new Questions(0, "What is the capital of France?", "London", "Paris", "Berlin", "Rome",
                "Paris");
        questionObj[1] = new Questions(1, "Which is the largest planet in our solar system?", "Earth", "Jupiter",
                "Mars", "Venus", "Jupiter");
        questionObj[2] = new Questions(2, "What is the symbol for water?", "H2O", "NaCl", "CO2", "He", "H2O");
        questionObj[3] = new Questions(3, "In which year was the first iPhone released?", "2004", "2007", "2010",
                "2013", "2007");
        questionObj[4] = new Questions(4, "What is the tallest mountain in the world?", "Mount Everest", "K2",
                "Kangchenjunga", "Lhotse", "Mount Everest");
    }

    public void quiz() {
        for (Questions i : questionObj) {
            System.out.println("Question: " + i.getQuestion());
            System.out.println("Option 1: " + i.getOption1());
            System.out.println("Option 2: " + i.getOption2());
            System.out.println("Option 3: " + i.getOption3());
            System.out.println("Option 4: " + i.getOption4());
            System.out.print("Your answer: ");
            try (Scanner scanner = new Scanner(System.in)) {
                String userAnswer = scanner.nextLine();
                if (userAnswer.equalsIgnoreCase(i.getAnswer())) {
                    System.out.println("Correct!");
                    totalScore++;
                } else {
                    System.out.println("Wrong! The correct answer is: " + i.getAnswer());
                }
            }
            System.out.println();
            System.out.println("Total Score: " + totalScore);
        }
    }
}
