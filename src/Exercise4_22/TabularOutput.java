package Exercise4_22;

public class TabularOutput {

    public static void main(String[] args) {
        System.out.println("N     N2     N3     N4");
        int value = 1;
        while(value <= 5) {
            System.out.printf("%d     %d      %d      %d%n", value, value * value, value * value * value, value * value * value * value);
            value++;

        }

    }
}
