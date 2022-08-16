package ClassTask_OnArray;

public class CompareArray {
    public static void main(String[] args) {
        String [] a = {"semicolon", "Cohorts", "Unicorns"};
        String [] a2 = {"semicolon", "Cohorts", "Software"};

        System.out.println("Result is: " + comparison(a,a2));
    }

//
//    public static boolean comparison(String[] a, String[] a2) {
//        if (a.length != a2.length)
//            return false;
//        for (int i = 0; i < a.length; i++)
//            if (a[i].equals(a2[i]))
//                return true;
//
//        return true;
//    }

    public static boolean comparison(String[] a, String[] a2) {
        if (a == a2)
            return true;
        if (a == null || a2 == null)
            return false;

        int length = a.length;
        if (a2.length != length)
            return false;

        for (int i = 0; i < length; i++) {
            Object o1 = a[i];
            Object o2 = a2[i];
            if (!(o1 == null ? o2 == null : o1 == (o2)))
                return false;
        }

       return true;
   }
}

