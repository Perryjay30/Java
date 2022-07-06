package MobilePhone;

import java.util.Scanner;

public class Nokia {

    public static void main(String[] args) {
        System.out.printf("1.Phone book%n 2. Messages%n 3. Chats%n 4. Call register%n 5.Tones%n 6. Settings%n 7. Call Divert%n" +
                "8. Games%n 9. Calculator%n 10. Reminders%n 11.Clock%n 12. Profiles%n 13. SIM Services%n");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an option: ");
        int option = input.nextInt();
        switch (option) {
            case 1:
                phoneBook();
                break;
            case 2:
                messages();
                break;
            case 3:
               chat();
               break;
            case 4:
                callRegister();
                break;
            case 5:
                tones();
                break;
            case 6:
                settings();
                break;
            case 7:
                callDivert();
                break;
            case 8:
                games();
                break;
            case 9:
                calculator();
            case 10:
                reminder();
                break;
            case 11:
                clock();
                break;
            case 12:
                profiles();
                break;
            case 13:
                simServices();
                break;
            default :
                System.out.println("Invalid option");
                break;
        }
    }

    public static void phoneBook() {
        System.out.printf("1. Search%n2. Service number%n3. Add name%n4. Erase%n5. Edit%n6. Assign tone%n" +
                "7. Send b'card%n8. Options%n9. Speed dials%n10. Voice tags%n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an option: ");
        int option = input.nextInt();
        switch (option) {
            case 1:
                System.out.println("Search");
                break;
            case 2:
                System.out.println("Service number");
                break;
            case 3:
                System.out.println("Add name");
                break;
            case 4:
                System.out.println("Erase");
                break;
            case 5:
                System.out.println("Edit");
                break;
            case 6:
                System.out.println("Assign tone");
                break;
            case 7:
                System.out.println("Send b'card");
                break;
            case 8:
                options();
                break;
            case 9:
                System.out.println("Speed dials");
                break;
            case 10:
                System.out.println("Voice tags");
                break;
            default:
                System.out.println("Not a valid option");
                break;
        }
    }

    public static void options() {
        System.out.printf("\t1. Type of view%n\t2.Memory status");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an option: ");
        int option = input.nextInt();
        switch (option) {
            case 1:
                System.out.println("Type of view");
                break;
            case 2:
                System.out.println("Memory status");
                break;
            default:
                ;
        }
    }


        public static void messages() {
        System.out.printf("1. Write messages%n2.Inbox%n3. Outbox%n4. Picture messages%n5. Templates%n" +
                "6. Smileys%n7. Message%n8. Info Service%n9. Voice mailbox number%n9. Service command editor");
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter an option: ");
        int option = input.nextInt();
        switch (option) {
            case 1:
                System.out.println("Write Messages");
                break;
            case 2:
                System.out.println("Inbox");
                break;
            case 3:
                System.out.println("Outbox");
                break;
            case 4:
                System.out.println("Picture messages");
                break;
            case 5:
                System.out.println("Templates");
                break;
            case 6:
                System.out.println("Smileys");
                break;
            case 7:
                messageSetings();
                break;
            case 8:
                System.out.println("Info service");
                break;
            case 9:
                System.out.println("Voice mailbox number");
                break;
            case 10:
                System.out.println("Service command editor");
                break;
            default:
                System.out.println("Not a valid option");
                break;

        }
    }

    public static void messageSetings() {
        System.out.printf("\t1. Set %n\t2. Common");
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter an option: ");
        int option = input.nextInt();
        switch (option) {
            case 1:
                System.out.println("Set");
                break;
            case 2:
                System.out.println("Common");
                break;
            default:
                System.out.println("Not a valid option");
                break;
        }
    }

    public static void set() {
        System.out.printf("\t1. Mesage centre number%n\t2. Message sent as%n\t3. Message validity");
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter an option: ");
        int option = input.nextInt();
        switch (option) {
            case 1:
                System.out.println("message centre number");
                break;
            case 2:
                System.out.println("message sent as");
                break;
            case 3:
                System.out.println("message validity");
                break;
            default:
                System.out.println("Not a valid option");
                break;
        }
    }

    public static void common() {
        System.out.printf("\t1. Delivery reports%n\t2. Reply via same centre%n\t3. Character suport");
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter an option: ");
        int option = input.nextInt();
        switch (option) {
            case 1:
                System.out.println("Delivery report");
                break;
            case 2:
                System.out.println("Reply via same centre");
                break;
            case 3:
                System.out.println("Character support");
                break;
            default:
                System.out.println("Enter a valid option");
                break;
        }
    }

    public static void chat() {
        System.out.println("chat");
    }

    public static void callRegister() {
        System.out.printf("1. Missed calls%n2. Recieved calls%n3. Dialled numbers%n4. Erase recent call lists%n" +
                "5. Show call duration%n6. Show call cost%n7. Call cost settings%n8. Prepaid credit");
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter an option: ");
        int option = input.nextInt();
        switch (option) {
            case 1:
                System.out.println("Missed calls");
                break;
            case 2:
                System.out.println("Recieved calls");
                break;
            case 3:
                System.out.println("Dialled numbers");
                break;
            case 4:
                System.out.println("Erase recent call lists");
                break;
            case 5:
                showCallDuration();
                break;
            case 6:
                showCallCosts();
                break;
            case 7:
                callCostSettings();
                break;
            case 8:
                System.out.println("Prepaid credit");
                break;
            default:
                System.out.println("Wrong option");
                break;
        }
    }

    public static void showCallDuration() {
        System.out.printf("\t1. Last call duration%n\t2. All calls' duration%n\t3. Received calls duration%n\t4.Dialled calls duration%n\t5. Clear counters");
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter an option: ");
        int option = input.nextInt();
        switch (option) {
            case 1:
                System.out.println("Last call duration");
                break;
            case 2:
                System.out.println("All cals duration");
                break;
            case 3:
                System.out.println("Received calls duration");
                break;
            case 4:
                System.out.println("Dialled calls duration");
                break;
            case 5:
                System.out.println("Clear counters");
                break;
            default:
                System.out.println("Wrong option");
                break;
        }
    }

    public static void showCallCosts() {
        System.out.printf("\t1. Last call cost%n\t2. All calls costs%n\t3. Clear counters");
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter an option: ");
        int option = input.nextInt();
        switch (option) {
            case 1:
                System.out.println("Last call cost");
                break;
            case 2:
                System.out.println("All calls costs");
                break;
            case 3:
                System.out.println("Clear counters");
                break;
            default:
                System.out.println("Enter a valid option");
                break;
        }
    }

    public static void callCostSettings() {
        System.out.printf("\t1. Call cost limit%n\t2. Show cost in");
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter an option: ");
        int option = input.nextInt();
        switch (option) {
            case 1:
                System.out.println("Call cost limit");
                break;
            case 2:
                System.out.println("Show cost in");
                break;
            default:
                System.out.println("Wrong input");
                break;
        }
    }

    public static void tones() {
        System.out.printf("1.Ringing tone%n2. Ringing volume%n3. Incoming call alert%n4. Composer%n" +
                "5. Message alert tone%n6. Keypad tones%n7. Warning and gaming tones%n8. Vibrating alert%n9. Screen saver");
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter an option: ");
        int option = input.nextInt();
        switch (option) {
            case 1:
                System.out.println("Ringing tone");
                break;
            case 2:
                System.out.println("Ringing volume");
                break;
            case 3:
                System.out.println("Incoming call alert");
                break;
            case 4:
                System.out.println("Composer");
                break;
            case 5:
                System.out.println("Message alert tone");
                break;
            case 6:
                System.out.println("Keypad tones");
                break;
            case 7:
                System.out.println("Warning and gaming tones");
                break;
            case 8:
                System.out.println("Vibrating alert");
                break;
            case 9:
                System.out.println("Screen saver");
                break;
            default:
                System.out.println("Input a valid option");
                break;
        }
    }

    public static void settings() {
        System.out.printf("1. Call setting%n2. Phone settings%n3. Security settings%n4. Restore factory settings");
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter an option: ");
        int option = input.nextInt();
        switch (option) {
            case 1:
                callSettings();
                break;
            case 2:
                phoneSettings();
                break;
            case 3:
                securitySettings();
                break;
            case 5:
                System.out.println("Restore factory settings");
                break;
            default:
                ;
            }
        }


    public static void callSettings() {
        System.out.printf("\t1. Automatic redial%n\t2. Speed dialing%n\t3. Call waiting options%n\t4. Own number sending%n\t5. Phone line in use%n\t6. Automatic answer");
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter an option: ");
        int option = input.nextInt();
        switch (option) {
            case 1:
                System.out.println("Automatic redial");
                break;
            case 2:
                System.out.println("Speed dialing");
                break;
            case 3:
                System.out.println("Call waiting options");
                break;
            case 4:
                System.out.println("Own number sending");
                break;
            case 5:
                System.out.println("Phone line in use");
                break;
            case 6:
                System.out.println("Automatic answer");
                break;
            default:
                ;
        }
    }

    public static void phoneSettings() {
        System.out.printf("\t1. Language%n\t2. Cell info display%n\t3. Welcome note%n\t4. Network selection%n\t5. Lights%n\t6. Confirm SIM service actions");
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter an option: ");
        int option = input.nextInt();
        switch (option) {
            case 1:
                System.out.println("Language");
                break;
            case 2:
                System.out.println("Cell info display");
                break;
            case 3:
                System.out.println("Welcome note");
                break;
            case 4:
                System.out.println("Network selection");
                break;
            case 5:
                System.out.println("Lights");
                break;
            case 6:
                System.out.println("Confirm SIM service actions");
                break;
            default:
                ;

        }
    }

    public static void securitySettings() {
        System.out.printf("\t1. PIN code request%n\t2. Call barring service%n\t3. Fixed dialing%n\t4. Closed user group%n\t5. Phone security%n\t6. Change access codes");
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter an option: ");
        int option = input.nextInt();
        switch (option) {
            case 1:
                System.out.println("PIN code request");
                break;
            case 2:
                System.out.println("Call barring service");
                break;
            case 3:
                System.out.println("Fixed dialing");
                break;
            case 4:
                System.out.println("Closed user group");
                break;
            case 5:
                System.out.println("Phone security");
                break;
            case 6:
                System.out.println("Change access codes");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }

    public static void callDivert() {
        System.out.println("Call divert");
    }
    public static void games() {
        System.out.println("Games");
    }
    public static void calculator() {
        System.out.println("Calculator");
    }
    public static void reminder() {
        System.out.println("Reminders");
    }
    public static void clock() {
        System.out.printf("1. Alarm clock%n2. Clock settings%n3. Date settings%n4. Stopwatch%n5. Countdown timer%n6. Auto update of time and date");
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter an option: ");
        int option = input.nextInt();
        switch (option) {
            case 1:
                System.out.println("Alarm clock");
                break;
            case 2:
                System.out.println("Clock settings");
                break;
            case 3:
                System.out.println("Date settings");
                break;
            case 4:
                System.out.println("Stopwatch");
                break;
            case 5:
                System.out.println("Countdown timer");
                break;
            case 6:
                System.out.println("Auto update of date and time");
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
    }

    public static void profiles() {
        System.out.println("Profiles");
    }

    public static void simServices() {
        System.out.println("SIM services");
    }

}
