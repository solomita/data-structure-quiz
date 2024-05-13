package package_1;

import java.util.Scanner;

public class NumberSearch {
    public static int searchNumber(int[] arr, int num) {
        int count = 0;
        for (int n : arr) {
            if (n == num) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sequence of numbers separated by spaces: ");
        String sequenceInput = scanner.nextLine();
        String[] numbersStr = sequenceInput.split(" ");
        int[] numbers = new int[numbersStr.length];
        for (int i = 0; i < numbersStr.length; i++) {
            numbers[i] = Integer.parseInt(numbersStr[i]);
        }

        System.out.print("Enter a number to be searched: ");
        int searchNum = scanner.nextInt();

        int occurrences = searchNumber(numbers, searchNum);

        if (occurrences > 0) {
            System.out.println("The number " + searchNum + " appears " + occurrences + " time(s) in the sequence.");
        } else {
            System.out.println("The number " + searchNum + " is not present in the sequence.");
        }

        scanner.close();
    }
}
