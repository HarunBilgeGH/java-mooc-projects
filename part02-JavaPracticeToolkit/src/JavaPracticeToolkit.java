import java.util.Scanner;

public class JavaPracticeToolkit {

    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printSpaces(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("\nJava Practice Toolkit");
            System.out.println("1 - Number Statistics");
            System.out.println("2 - Range Calculator");
            System.out.println("3 - Divisible by Three");
            System.out.println("4 - Pattern Printer");
            System.out.println("5 - Exit");
            System.out.print("Choose an option: ");

            int choice = Integer.valueOf(scan.nextLine());

            if (choice == 5) {
                System.out.println("Goodbye!");
                break;
            } else if (choice == 1) {
                System.out.println("\nNumber Statistics");
                System.out.println("Enter numbers. Enter 0 to stop.");

                int numberOfNumbers = 0;
                int positive = 0;
                int negative = 0;
                int positiveTotal = 0;
                int total = 0;
                int evenNumbers = 0;
                int oddNumbers = 0;

                while (true) {
                    int number = Integer.valueOf(scan.nextLine());

                    if (number == 0) {
                        break;
                    }

                    numberOfNumbers++;
                    total = total + number;

                    if (number > 0) {
                        positive++;
                        positiveTotal = positiveTotal + number;
                    } else {
                        negative++;
                    }

                    if (number % 2 == 0) {
                        evenNumbers++;
                    } else {
                        oddNumbers++;
                    }
                }

                System.out.println("Number of numbers: " + numberOfNumbers);
                System.out.println("Number of positive numbers: " + positive);
                System.out.println("Number of negative numbers: " + negative);
                System.out.println("Sum: " + total);

                if (numberOfNumbers == 0) {
                    System.out.println("Average: Cannot calculate the average");
                } else {
                    System.out.println("Average: " + ((double) total / numberOfNumbers));
                }

                if (positive == 0) {
                    System.out.println("Average of positive numbers: Cannot calculate the average");
                } else {
                    System.out.println("Average of positive numbers: " + ((double) positiveTotal / positive));
                }

                System.out.println("Even numbers: " + evenNumbers);
                System.out.println("Odd numbers: " + oddNumbers);

            } else if (choice == 2) {
                System.out.println("\nRange Calculator");

                int sum = 0;
                int factorial = 1;
                int evenNumbers = 0;
                int oddNumbers = 0;

                System.out.print("First Number: ");
                int first = Integer.valueOf(scan.nextLine());

                System.out.print("Last Number: ");
                int last = Integer.valueOf(scan.nextLine());

                System.out.println("Numbers:");

                for (int i = first; i <= last; i++) {
                    System.out.println(i);
                    sum = sum + i;

                    if (i % 2 == 0) {
                        evenNumbers++;
                    } else {
                        oddNumbers++;
                    }
                }

                for (int i = 1; i <= last; i++) {
                    factorial = factorial * i;
                }

                System.out.println("Sum: " + sum);
                System.out.println("Factorial of last number: " + factorial);
                System.out.println("Even numbers: " + evenNumbers);
                System.out.println("Odd numbers: " + oddNumbers);

            } else if (choice == 3) {
                System.out.println("\nDivisible by Three");

                System.out.print("Give the beginning: ");
                int beginning = Integer.valueOf(scan.nextLine());

                System.out.print("Give the end: ");
                int end = Integer.valueOf(scan.nextLine());

                System.out.println("Divisible by Three:");

                for (int i = beginning; i <= end; i++) {
                    if (i % 3 == 0) {
                        System.out.println(i);
                    }
                }

            } else if (choice == 4) {
                System.out.println("\nPattern Printer");
                System.out.println("1 - Rectangle");
                System.out.println("2 - Right Triangle");
                System.out.println("3 - Pyramid");
                System.out.println("4 - Diamond");
                System.out.print("Choose your pattern: ");

                int pattern = Integer.valueOf(scan.nextLine());

                if (pattern == 1) {
                    System.out.print("Width: ");
                    int width = Integer.valueOf(scan.nextLine());

                    System.out.print("Height: ");
                    int height = Integer.valueOf(scan.nextLine());

                    for (int row = 0; row < height; row++) {
                        for (int column = 0; column < width; column++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }

                } else if (pattern == 2) {
                    System.out.print("Height: ");
                    int height = Integer.valueOf(scan.nextLine());

                    for (int row = 1; row <= height; row++) {
                        printStars(row);
                    }

                } else if (pattern == 3) {
                    System.out.print("Height: ");
                    int height = Integer.valueOf(scan.nextLine());

                    for (int row = 1; row <= height; row++) {
                        int spaces = height - row;
                        int stars = 2 * row - 1;

                        printSpaces(spaces);
                        printStars(stars);
                    }

                } else if (pattern == 4) {
                    System.out.print("Height: ");
                    int height = Integer.valueOf(scan.nextLine());

                    for (int row = 1; row <= height; row++) {
                        int spaces = height - row;
                        int stars = 2 * row - 1;

                        printSpaces(spaces);
                        printStars(stars);
                    }

                    for (int row = height - 1; row >= 1; row--) {
                        int spaces = height - row;
                        int stars = 2 * row - 1;

                        printSpaces(spaces);
                        printStars(stars);
                    }

                } else {
                    System.out.println("Invalid pattern");
                }

            } else {
                System.out.println("Invalid option");
            }
        }
    }
}