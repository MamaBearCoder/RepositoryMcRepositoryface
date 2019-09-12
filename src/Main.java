import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter number of days:");
        int month = keyboard.nextInt();
        String monthName;
        switch (month) {
            case 31:
                monthName = "April, June, September, November have 31 days.";
                break;

            case 30:
                monthName = "January, March, May, July, August, October, December have 30 days.";
                break;

            case 28:
            case 29:
                monthName = "February has 28 days, but on leap year it has 29.";
                break;

            default:
                monthName = "Unknown";
                break;
        }

        if (month < 28 || month > 31) {
            System.out.println("No months have exactly" + " " + month + " " + "days");
        }
        else {
            System.out.println(monthName);
        }

    }
}

