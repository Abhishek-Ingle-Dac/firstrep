import java.util.Arrays;

public class program {
    public static void main(String[] args) {
        // Example array
        int[] arr = {10, 20, 4, 45, 99, 3, 5};

        // Calling the function to get the sum of the three largest numbers
        int sum = sumOfThreeLargest(arr);

        // Output the result
        System.out.println("Sum of the three largest numbers: " + sum);
    }

    public static int sumOfThreeLargest(int[] arr) {
        // Edge case: if array has fewer than 3 elements, return 0
        if (arr.length < 3) {
            System.out.println("Array must contain at least 3 elements.");
            return 0;
        }

        // Sort the array in descending order
        Arrays.sort(arr);

        // Sum the last three elements from the sorted array (largest three)
        int sum = arr[arr.length - 1] + arr[arr.length - 2] + arr[arr.length - 3];
        
        return sum;
    }
}
