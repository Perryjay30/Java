package calculator;

public class Calculator {

    public int addTwoNumbers(int firstNum1, int secondNum2) {
    int sum = firstNum1 + secondNum2;
        System.out.println("The sum is: " + sum);
    return sum;
    }

    public int subtractTwoNumbers(int firstNum1, int secondNum2) {
        int subtract = firstNum1 - secondNum2;
        System.out.println("The subtract is: " + subtract);

        return subtract;
    }

    public int divideTwoNumbers(int firstNum1, int secondNum2) {
        int divide = firstNum1 / secondNum2;
        System.out.println("The divide is: " + divide);

        return divide;
    }

    public int multiplyTwoNumbers(int firstNum1, int secondNum2) {
        int multiply = firstNum1 * secondNum2;
        System.out.println("The multiply is: " + multiply);

        return multiply;
    }

}
