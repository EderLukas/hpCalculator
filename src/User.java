import java.util.Scanner;

public class User {
    private int userChoice;
    private double userInput1;
    private double userInput2;

    public void userChoice () {
        Scanner s = new Scanner(System.in);
        System.out.println("What is your next action: ");
        this.setUserChoice(s.nextInt());
    }

    public void userInput() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number: ");
        this.setUserInput1(s.nextDouble());
        System.out.println("Enter second number: ");
        this.setUserInput2(s.nextDouble());
    }

    public int getUserChoice() {
        return userChoice;
    }

    public void setUserChoice(int userChoice) {
        this.userChoice = userChoice;
    }

    public double getUserInput1() {
        return userInput1;
    }

    public void setUserInput1(double userInput1) {
        this.userInput1 = userInput1;
    }

    public double getUserInput2() {
        return userInput2;
    }

    public void setUserInput2(double userInput2) {
        this.userInput2 = userInput2;
    }
}
