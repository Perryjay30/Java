package PerryTheProgrammer14;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBook {
    private static Scanner input = new Scanner(System.in);
    private static ArrayList<String> names = new ArrayList<>();
    private static ArrayList<String> address = new ArrayList<>();
    private static ArrayList<String> telephoneNumber = new ArrayList<>();
    private static ArrayList<String> email = new ArrayList<>();

    public static void main(String[] args) {
        getContactDetails();
    }

        public static void getName() {
            System.out.print("Enter name: ");
            String name = input.nextLine();
            names.add(name);

        }

        public static void getAddresses() {
            String addresses;
            System.out.print("Enter address: ");
            addresses = input.nextLine();
            address.add(addresses);

        }

        public static void getPhoneNumber() {
            String phoneNumber;
            System.out.print("Enter Phone Number: ");
            phoneNumber = input.nextLine();
            telephoneNumber.add(phoneNumber);

        }

        public static void getEmail() {
            System.out.print("Enter Email: ");
            String emails = input.nextLine();
            email.add(emails);
        }

        public static void getContactDetails() {
        getName();
        getAddresses();
        getPhoneNumber();
        getEmail();
        System.out.println("Would you like to add more details? ");
        String answer = input.nextLine();
        switch (answer) {
            case "yes":
                getContactDetails();
                break;
            case "no":
                for (int i = 0; i < names.size(); i++) {
                    System.out.printf("Name: %s%n", names.get(i));
                    System.out.println("=====================================================");
                        System.out.printf("Address: %s%n", address.get(i));
                    System.out.println("=====================================================");
                        System.out.printf("TelephoneNumber: %s%n", telephoneNumber.get(i));
                    System.out.println("=====================================================");
                        System.out.printf("Email: %s%n", email.get(i));
                    System.out.println("=====================================================");

                }
                System.out.println();
        }
        }
}