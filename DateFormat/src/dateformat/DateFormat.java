package dateformat;

import java.util.Scanner;

public class DateFormat {

    public static void main(String[] args) {

        System.out.println("Please enter a date in the format of MM/DD/YYYY.");
        Scanner dateInput = new Scanner(System.in);
        String date = dateInput.nextLine();
        String month = date.substring(0, 2);
        String day = date.substring(3, 5);
        String year = date.substring(6, 10);

        int m = Integer.parseInt(month);
        int d = Integer.parseInt(day);
        int y = Integer.parseInt(year);

        if (m > 12) {
            System.out.println("Please enter a valid month.");
            System.exit(1);
        }

        String monthString;
        switch (m) {
            case 4:
            case 6:
            case 9:
            case 11:
                if (d > 30) {
                    System.out.println("You have entered an invalid day!");
                    System.exit(1);
                }
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (d > 31) {
                    System.out.println("You have entered an invalid day!");
                    System.exit(1);
                }
                break;
            default:
                if (d > 31) {
                    System.out.println("You have entered an invalid day!");
                    System.exit(1);
                }
                break;
        }
        boolean leap = false;
        if (y % 4 == 0) {
            if (y % 100 == 0) {
                if (y % 400 == 0) {
                    leap = true;
                } else {
                    leap = false;
                }

            } else {
                leap = true;
            }
        }
        if (m == 2) {
            if (leap == true) {
                if (d > 29) {
                    System.out.println("Invalid date! It's a leap year, February has 29 days.");
                    System.exit(1);
                }
            } else if (d > 28) {
                System.out.println("Invalid date! It's not leap year, February has 28 days.");
                System.exit(1);
            }

        }

        System.out.println(date + " is a valid date.");

    }

}
