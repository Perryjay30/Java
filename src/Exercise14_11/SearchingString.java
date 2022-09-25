package Exercise14_11;

public class SearchingString {
    public static void main(String[] args) {
        String text = "Perry loves software programming";

        System.out.printf("'m' in the text is located at:%d%n", text.indexOf('m'));
        System.out.printf("'$' in the text is located at:%d%n", text.indexOf('$'));
        System.out.printf("'p' in the text is located at:%d%n", text.indexOf('p', 10));
        System.out.printf("'g' in the text is located at:%d%n", text.indexOf('g'));
        System.out.printf("'w' in the text is located at:%d%n", text.indexOf('w'));
    }
}
