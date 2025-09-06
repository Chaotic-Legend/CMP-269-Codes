// CMP 269: Programming Methods III - Homework0Review - Isaac D. Hoyos  

import java.util.Random; // Required for shuffling.

public class Homework0Review {

    /**
     * Task 1: getRectangleArea
     * Calculates the area of a rectangle.
     */
    public static double getRectangleArea(double length, double width) {
        // Check for invalid input as negative values are not allowed.
        if (length < 0 || width < 0) {
            return -1.0;
        }
        // Calculate area using the formula: length × width.
        return length * width;
    }

    /**
     * Task 2: sum
     * Calculates the sum of the first n natural numbers.
     */
    public static int sum(int n) {
        // Return 0 if n is not positive.
        if (n <= 0) {
            return 0;
        }
        // Formula for sum of first n natural numbers: n * (n + 1) / 2.
        return (n * (n + 1)) / 2;
    }

    /**
     * Task 3: getCircleArea
     * Calculates the area of a circle.
     */
    public static double getCircleArea(double radius) {
        // Return 0.0 if radius is not positive.
        if (radius <= 0) {
            return 0;
        }
        // Formula for area of a circle: π × r^2.
        return Math.PI * Math.pow(radius, 2);
    }

    /**
     * Task 4: getBinaryFromDecimal
     * Converts a positive integer to its binary representation.
     */
    public static String getBinaryFromDecimal(int number) {
        // Return null if the number is negative.
        if (number < 0) {
            return null;
        }
        // Binary is the value zero when the number is 0.
        if (number == 0) {
            return "0";
        }
        // Use built-in method to convert to binary string.
        return Integer.toBinaryString(number);
    }
    
    /**
     * Task 5: linear search
     * Searches for the first occurrence of a key in an integer array.
     */
    public static int linearSearch(int[] arr, int key) {
        // Return -1 if the array is not initialized.
        if (arr == null) {
            return -1;
        }
        // Iterate through the array to find the key.
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; // Return the index of the first match.
            }
        }
        // Return -1 if key not found.
        return -1;
    }
    
    /**
     * Task 6: squareNums
     * Squares each value in the array (in place).
     */
    public static void squareNums(int[] arr) {
        // Do nothing if the array is not initialized.
        if (arr == null) {
            return;
        }
        // Square each element in the array.
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];
        }
    }
    
    /**
     * Task 7: sum array
     * Calculates the sum of all numbers in the array.
     */
    public static int sum(int[] arr) {
        if (arr == null) {
            return 0; // Return 0 for null array.
        }
        int total = 0;
        for (int n : arr) {
            total += n;
        }
        return total;
    }
    
    /**
     * Task 8: factorial
     * Computes the factorial of a number.
     */
    public static int factorial(int n) {
        if (n < 0) {
            return -1; // Factorial is undefined for negative numbers.
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    
    /**
     * Task 9: shuffle
     * Removes the element at the given index, shifts the array, and shuffles the remaining elements.
     */
    public static String[] shuffle(String[] arr, int index) {
        if (arr == null || index < 0 || index >= arr.length) {
            return arr; // Do nothing if the array or index is invalid.
        }
        // Create a new array with one less element.
        String[] temp = new String[arr.length - 1];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i != index) {
                temp[j++] = arr[i];
            }
        }
        // Shuffle the temp array.
        Random rand = new Random();
        for (int i = temp.length - 1; i > 0; i--) {
            int randomIndex = rand.nextInt(i + 1);
            String t = temp[i];
            temp[i] = temp[randomIndex];
            temp[randomIndex] = t;
        }
        return temp;
    }

    /**
     * Main Method Testing
     */
    public static void main(String[] args) {
        System.out.println("CMP 269: Programming Methods III - Homework0Review - Isaac D. Hoyos\n");
        
        // Test Task 1: getRectangleArea
        System.out.println("=== Task 1: getRectangleArea ===");
        System.out.println("Rectangle Area (5.0 x 3.0): " + getRectangleArea(5.0, 3.0));
        System.out.println("Rectangle Area (10.5 x 2.5): " + getRectangleArea(10.5, 2.5));
        System.out.println("Rectangle Area (-4.0 x 3.0): " + getRectangleArea(-4.0, 3.0));
        System.out.println("Rectangle Area (6.0 x 7.0): " + getRectangleArea(6.0, 7.0) + "\n");

        // Test Task 2: sum
        System.out.println("=== Task 2: sum ===");
        System.out.println("Sum of first 5 natural numbers: " + sum(5));
        System.out.println("Sum of first 10 natural numbers: " + sum(10));
        System.out.println("Sum of non-positive number (0): " + sum(0));
        System.out.println("Sum of negative number (-3): " + sum(-3) + "\n");

        // Test Task 3: getCircleArea
        System.out.println("=== Task 3: getCircleArea ===");
        System.out.println("Circle Area (Radius 3.0): " + getCircleArea(3.0));
        System.out.println("Circle Area (Radius 5.5): " + getCircleArea(5.5));
        System.out.println("Circle Area (Radius 0.0): " + getCircleArea(0.0));
        System.out.println("Circle Area (Radius -2.0): " + getCircleArea(-2.0) + "\n");

        // Test Task 4: getBinaryFromDecimal
        System.out.println("=== Task 4: getBinaryFromDecimal ===");
        System.out.println("Binary of 6: " + getBinaryFromDecimal(6));
        System.out.println("Binary of 15: " + getBinaryFromDecimal(15));
        System.out.println("Binary of 0: " + getBinaryFromDecimal(0));
        System.out.println("Binary of -4: " + getBinaryFromDecimal(-4) + "\n");

        // Test Task 5: linear search
        System.out.println("=== Task 5: linear search ===");
        int[] arr = {3, 5, 7, 9, 11};
        System.out.println("Index of 7: " + linearSearch(arr, 7));
        System.out.println("Index of 3: " + linearSearch(arr, 3));
        System.out.println("Index of 11: " + linearSearch(arr, 11));
        System.out.println("Index of 100 (not found): " + linearSearch(arr, 100));
        System.out.println("Array not initialized (null): " + linearSearch(null, 5) + "\n");

        // Test Task 6: squareNums
        System.out.println("=== Task 6: squareNums ===");
        int[] nums = {2, -3, 4, 5};
        System.out.print("Before Squaring: ");
        for (int n : nums) {
            System.out.print(n + " ");
        }
        System.out.println();
        squareNums(nums);
        System.out.print("After Squaring: ");
        for (int n : nums) {
            System.out.print(n + " ");
        }
        System.out.println("\n");
        
        // Test Task 7: sum array
        System.out.println("=== Task 7: sum array ===");
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Sum of {1, 2, 3, 4, 5}: " + sum(numbers));
        System.out.println("Sum of empty array {}: " + sum(new int[]{}));
        System.out.println("Sum of null array: " + sum(null) + "\n");
        
        // Test Task 8: factorial
        System.out.println("=== Task 8: factorial ===");
        System.out.println("Factorial of 5: " + factorial(5));
        System.out.println("Factorial of 4: " + factorial(4));
        System.out.println("Factorial of 0: " + factorial(0));
        System.out.println("Factorial of -3: " + factorial(-3) + "\n");
        
        // Test Task 9: shuffle
        System.out.println("=== Task 9: shuffle ===");
        String[] words = {"C++", "Java", "Kotlin", "Python"};
        System.out.print("Original Array: ");
        for (String s : words) System.out.print(s + " ");
        String[] shuffled = shuffle(words, 1);
        System.out.print("\nAfter Shuffle Array: ");
        for (String s : shuffled) System.out.print(s + " ");
        System.out.println("\n");
    }
}