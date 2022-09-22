package Exercise14_0;

public class StringReversal {
    public static void main(String[] args) {
        StringBuilder fourteen = new StringBuilder("Hello there");
        System.out.printf("Initial String = %s%n",fourteen.toString());
        fourteen.reverse();
        System.out.printf("Reversal = %s%n", fourteen.toString());

    }
}
