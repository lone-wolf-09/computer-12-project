import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateCalculator {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Input year
            System.out.print("Enter year (4 digits): ");
            int year = scanner.nextInt();
            if (year < 1) {
                System.out.println("Invalid year.");
                return;
            }

            // Input day number
            System.out.print("Enter day number (1-366): ");
            int dayNumber = scanner.nextInt();
            if (dayNumber < 1 || dayNumber > 366 || (dayNumber > 365 && !isLeapYear(year))) {
                System.out.println("Invalid day number.");
                return;
            }

            // Convert day number to date
            LocalDate startDate = LocalDate.ofYearDay(year, dayNumber);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d'TH' MMMM, yyyy");
            System.out.println("Date: " + startDate.format(formatter));

            // Input N
            System.out.print("Enter N (1-100): ");
            int N = scanner.nextInt();
            if (N < 1 || N > 100) {
                System.out.println("Invalid N.");
                return;
            }

            // Calculate future date
            LocalDate futureDate = startDate.plusDays(N);
            System.out.println("Date after " + N + " days: " + futureDate.format(formatter));

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter valid numbers.");
        }
        scanner.close();
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    }
}