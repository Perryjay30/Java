package Chapter14_Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailVerifier {

    public static void main(String[] args) {
//        String email = "felu.oladeji@semicolon.africa";
//        if(isValidEmailAddress(email))
//            System.out.println("Email is Valid");
//        else
//            System.out.println("Email is Invalid");
         boolean isValid = Pattern.matches("[a-z].[a-z]+@semicolon.africa",
                "felu.oladeji@semicolon.africa");
        System.out.println(isValid);

        Pattern p = Pattern.compile("[a-z].[a-z]+@semicolon.africa");
        Matcher m = p.matcher("felu.oladeji@semicolon.africa");
        System.out.println(m.find());

    }

    public static boolean isValidEmailAddress(String email) {
        boolean isValid = email.matches("[a-z].[a-z]+@semicolon.africa");
        return isValid;
    }
}
