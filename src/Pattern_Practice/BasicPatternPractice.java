package Pattern_Practice;

import java.util.Optional;

public class BasicPatternPractice {
    private static String [] names = {"Tolani", "David", "kelechi", "Flecther", "Darren"};

    public static void main(String[] args) {
        Optional <String> foundName = findName("Lawson");
        if(foundName.isEmpty()) System.out.println("Name not found");
    }
//
//    private static String findName(String name) {
//        for (String n : names) {
//            if(n.equalsIgnoreCase(name)) return n;
//        }
//        return null;
//    }

    //instead use pattern

    private static Optional<String> findName(String name) {
        for (String n : names) {
            if(n.equalsIgnoreCase(name)) return Optional.of(n);
        }
        return Optional.empty();
    }
}
