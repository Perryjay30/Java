package Exercise14_8;

import java.util.Scanner;

public class TokenizingTelephoneNumbers {
   public static String collectPhoneNumber() {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a phone number in the form of (555) 555-5555: ");
       return sc.nextLine();
   }

   public static boolean validatePhoneNumber(String phoneNumber) {
       return phoneNumber.matches("[(]\\d{3}[)]\\s\\d{3}[--]\\d{4}");
   }

    public static void main(String[] args) {
        String number = collectPhoneNumber();

        if (!validatePhoneNumber(number)) {
            System.out.println("phone number not in the form of (555) 555-5555");
        } else {
            String areaCodeSubstring = number.substring(0, 5);
            String[] areaCodeTokens = areaCodeSubstring.split("([(]?[)]?)");

            String phoneNumberString = number.substring(6);
            String[] phoneNumberTokens = phoneNumberString.split("-");

            System.out.println("area code: ");
            for (String counter : areaCodeTokens) {
                System.out.print(counter);
            }
            System.out.println();

            System.out.println("Phone number: ");
            for (String count : phoneNumberTokens) {
                System.out.println(count);
            }

        }
    }

}
