public class SevenSegment {

    private static String[][] perry = new String [5][4];

    private static void setA(){
        for(int i = 0; i <= 3; i++) {
            perry[0][i] = "*";
        }
    }

    private static void setB() {
        for(int i = 0; i <= 3; i++) {
            perry[i][3] = "*";
        }
    }

    private static void setC() {
        for(int i = 2; i < 5; i++) {
            perry[i][3] = "*";
        }
    }

    private static void setD() {
        for(int i = 0; i <= 3; i++) {
          perry[4][i] = "*";
        }
    }

    private static void setE() {
        for (int i = 2; i <= 4; i++) {
            perry[i][0] = "*";
        }
    }

    private static void setF() {
        for (int i = 0; i <= 2; i++) {
            perry[i][0] = "*";
        }
    }

    private static void setG() {
        for( int i = 0; i <= 3; i++) {
            perry[2][i] = "*";
        }
    }

    public static void setScreen(String code){
        for (int i = 0; i < perry.length; i++) {
            for(int j = 0; j < perry[i].length; j++) {
                perry[i][j] = " ";
            }
        }

        if(code.length() == 8) {
            if(code.charAt(7) == '1') {
                if(code.charAt(0) == '1') {
                    setA();
                }
                if(code.charAt(1) == '1') {
                    setB();
                }
                if(code.charAt(2) == '1') {
                    setC();
                }
                if(code.charAt(3) == '1') {
                    setD();
                }
                if(code.charAt(4) == '1') {
                    setE();
                }
                if(code.charAt(5) == '1') {
                    setF();
                }
                if(code.charAt(6) == '1') {
                    setG();
                }
            }
        }
    }

    public static void display(){
        for(int i = 0; i < perry.length; i++) {
            for(int j = 0; j < perry[i].length; j++) {
                System.out.print(perry[i][j] + " ");
            }
            System.out.println();
        }
    }
}
