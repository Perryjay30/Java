package Exercise8_7;

import static org.junit.jupiter.api.Assertions.*;

class Time2ModificationTest {
    public static void main(String[] args) {
        Time2Modification time1 = new Time2Modification();
        Time2Modification time2 = new Time2Modification(4);
        Time2Modification time3 = new Time2Modification(22, 47);
        Time2Modification time4 = new Time2Modification(12, 35, 49);
        Time2Modification time5 = new Time2Modification(time4);
        time5.increaseHour(11);
        System.out.println("initial Hour: 10:23:58 ");
        System.out.println("After increment: 11:23:58");
        time5.increaseMinute(34);
        System.out.println("initial minute: 04:33:58");
        System.out.println("after increment: 04:34:51");
        time5.tick(42);
        System.out.println("Initial second: 06:30:41");
        System.out.println("After increment: 06:30:42");


        System.out.println("Constructed with:");
        displayTime("time1: all default arguments", time1);
        displayTime("time2: hour specified; default minute and second", time2);
        displayTime("time3: hour and minute specified; default second", time3);
        displayTime("time4: hour, minute and second specified", time4);
        displayTime("time5: Time2Modification object time4 specified", time5);

        try {
            Time2Modification time6 = new Time2Modification(27, 74, 96);
        } catch (IllegalArgumentException e) {
            System.out.printf("%nException while initializing time6: %s%n", e.getMessage());
        }
    }

        private static void displayTime(String header,  Time2Modification time) {
            System.out.printf("%s%n   %s%n   %s%n", header, time.toUniversalString(), time.toString());
        }
}