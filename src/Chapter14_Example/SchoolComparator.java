package Chapter14_Example;

import java.util.Arrays;

public class SchoolComparator {
    private static String [] nigerianInstitutions = {"Unilag","Lasu", "Absu", "OAU", "Nsukka", "Unical", "Laspotech"};

    public static void main(String[] args) {
        for(int firstIndex = 0; firstIndex < nigerianInstitutions.length; firstIndex++) {
            for(int secondIndex = firstIndex+1; secondIndex < nigerianInstitutions.length; secondIndex++) {
               if(nigerianInstitutions[firstIndex].compareTo(nigerianInstitutions[secondIndex])>0)
               swapElements(firstIndex, secondIndex);
            }
        }
        System.out.println((Arrays.toString(nigerianInstitutions)));
    }

    public static void swapElements(int firstIndex, int secondIndex) {
        String temp;
        temp = nigerianInstitutions[firstIndex];
        nigerianInstitutions[firstIndex] = nigerianInstitutions[secondIndex];
        nigerianInstitutions[secondIndex] = temp;
    }
}
