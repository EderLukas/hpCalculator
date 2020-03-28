import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean isProgramRepeating = true;

        System.out.println("***** Welcome to the HP Calculator *****");
        User user = new User();
        do {
            printStartMenue();
            user.userChoice();

            switch (user.getUserChoice()) {
                case 1:
                    user.userInput();
                    System.out.println(
                            "Result: " + Calculator.add(user.getUserInput1(), user.getUserInput2())
                    );
                    break;
                case 2:
                    user.userInput();
                    System.out.println(
                            "Result: " + Calculator.subtract(user.getUserInput1(), user.getUserInput2())
                    );
                    break;
                case 3:
                    user.userInput();
                    System.out.println(
                            "Result: " + Calculator.multiply(user.getUserInput1(), user.getUserInput2())
                    );
                    break;
                case 4:
                    boolean invalidDivisionInput = true;
                    while(invalidDivisionInput) {
                        try{
                            user.userInput();
                            System.out.println(
                                    "Result: " + Calculator.devide(user.getUserInput1(), user.getUserInput2())
                            );
                            invalidDivisionInput = false;
                        } catch (DevideByZeroException e) {
                         System.out.println(e);
                        }
                    }
                    break;
                case 5:
                    boolean invalidModuloInput = true;
                    while(invalidModuloInput) {
                        try{
                            user.userInput();
                            System.out.println(
                                    "Result: " + Calculator.modulo(user.getUserInput1(), user.getUserInput2())
                            );
                            invalidModuloInput = false;
                        } catch (DevideByZeroException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    break;
                case 6:
                    isProgramRepeating = false;
                    break;
                default:
                    isProgramRepeating = true;
                    break;

            }

        } while (isProgramRepeating);

        System.out.println("***** Bye *****");
    }

    private static void printStartMenue() {
        System.out.println("***** *****" +
                "Options to choose:\n" +
                "1 Addition\n" +
                "2 Subtraction\n" +
                "3 Multiplication\n" +
                "4 Division\n" +
                "5 Modulo\n" +
                "6 Quit\n");
    }

}
