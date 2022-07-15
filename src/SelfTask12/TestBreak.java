package SelfTask12;

public class TestBreak {

    public static void main(String[] args) {

        int number = 0;
        int sum = 0;

        while(number < 200){
            number++;
            sum += number;
            if (sum >= 100)
                break;
        }
        System.out.println("the number is " + number);
        System.out.println("the sum is " + sum);
    }
}
