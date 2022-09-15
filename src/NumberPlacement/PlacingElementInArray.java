package NumberPlacement;

public class PlacingElementInArray {
    public static void main(String[] args) {
        int number =2342;
        System.out.println(PlacingElementInArray.arrayElementPlacing(number));
    }
    public static char [] arrayElementPlacing(int number) {
       String numberCharacter = "";
       numberCharacter += number;
       int numberLength = numberCharacter.length();

       char[] arrayElement = new char[numberLength];
        for (int i = 0; i < numberLength; i++) {
            arrayElement[i] = numberCharacter.charAt(i);
        }
//        System.out.println(arrayElement);
        return arrayElement;
    }
}
