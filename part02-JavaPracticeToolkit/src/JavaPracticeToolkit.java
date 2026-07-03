import java.util.Scanner;

public class JavaPracticeToolkit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true) {
            int choice = Integer.valueOf(scan.nextLine());
            System.out.println("1 - Number Statistics");
            System.out.println("2 - Range Calculator");
            System.out.println("3 - Divisible by Three");
            System.out.println("4 - Pattern Printer");
            System.out.println("5 - Exit");
            System.out.print("\nChoose an option: ");

            if (choice == 5) {
                break;
            }
            else if (choice == 1) {
                System.out.println("Number Statistics");
                int numberOfNumbers = 0;
                int positive = 0;
                int negative = 0;
                int posTotal = 0;
                int total = 0;
                int evenN = 0;
                int oddN = 0;
                
                while (true) {
                    int number = Integer.valueOf(scan.nextLine());
                    if (number == 0) {
                        break;
                    }
                    else if (number > 0) {
                        positive++;
                        posTotal = number+posTotal;
                    }
                    else if (number < 0) {
                        negative++;
                    }
                    else if (number % 2 == 0) {
                        evenN++;
                    }
                    else {
                        oddN++;
                    }
                    total = total + number;

                    numberOfNumbers++;
                }

                System.out.println("Number of numbers: "+ numberOfNumbers);
                System.out.println("Number of positive numbers: "+positive);
                System.out.println("Number of negative numbers: "+negative);
                System.out.println("Sum: "+total);
                if (numberOfNumbers == 0) {
                    System.out.println("Average: Cannot calculate the average");
                } else {
                    System.out.println("Average: " + ((double) total / numberOfNumbers));
                }
                if (positive == 0) {
                    System.out.println("Average of positive numbers: Cannot calculate the average");
                } else {
                    System.out.println("Average of positive numbers: " + ((double) posTotal / positive));
                }
                System.out.println("Even numbers: "+evenN);
                System.out.println("Odd numbers: "+oddN);
            }
            else if (choice == 2) {
                
            }
            else if (choice == 3) {
                
            }
            else if (choice == 4) {
                
            }
        }
    }
}