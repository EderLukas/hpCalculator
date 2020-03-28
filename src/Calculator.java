public class Calculator {

    public static double add (double userInput1, double userInput2) {
        return userInput1 + userInput2;
    }

    public static double subtract (double userInput1, double userInput2) {
        return userInput1 - userInput2;
    }

    public static double multiply (double userInput1, double userInput2) {
        return userInput1 * userInput2;
    }

    public static double devide (double userInput1, double userInput2) throws DevideByZeroException {
        if (userInput2 == 0) {
            throw new DevideByZeroException("Division by zero is not allowed.");
        }
        return userInput1 / userInput2;
    }

    public static double modulo (double userInput1, double userInput2) throws DevideByZeroException {
        if (userInput2 == 0) {
            throw new DevideByZeroException("Division by zero is not allowed.");
        }
        return userInput1 % userInput2;
    }
}
