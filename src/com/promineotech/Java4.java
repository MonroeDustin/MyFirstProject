package com.promineotech;

public class Java4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Question 1
		// Create an array of ages
        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};

        // Subtract the first number from the last number in the array
        int result = ages[ages.length - 1] - ages[0];
        System.out.println("Difference between first and last element: " + result);

        // Create another array with more numbers
        int[] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 15};

        // Subtract the first number from the last number in the second array
        int result2 = ages2[ages2.length - 1] - ages2[0];
        System.out.println("Difference in ages2: " + result2);

        // Calculate the average of all the numbers in ages2
        int sum = 0; // Variable to hold the total sum
        for (int age : ages2) { // Loop through each number in the array
            sum += age; // Add each number to the sum
        }
        double average = (double) sum / ages2.length; // Calculate the average
        System.out.println("Average age in ages2: " + average);

        // Step 2: String Array Operations

        // Create an array of names
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

        // 2.a Calculate the average number of letters in the names
        int totalLetters = 0;
        for (String name : names) { // Loop through each name
            totalLetters += name.length(); // Add the number of letters in the name
        }
        double averageLetters = (double) totalLetters / names.length; // Calculate the average
        System.out.println("Average letters per name: " + averageLetters);

        // 2.b Combine all the names into a single string with spaces
        String concatenatedNames = "";
        for (String name : names) { // Loop through each name
            concatenatedNames += name + " "; // Add the name and a space
        }
        System.out.println("Concatenated Names: " + concatenatedNames.trim()); // Remove extra space at the end

        // Step 3: Accessing Array Elements
        // the foiAccess the first and last elements of the ages array
        int lastElement = ages[ages.length - 1]; // Last element in the array
        int firstElement = ages[0]; // First element in the array
        System.out.println("First element: " + firstElement);
        System.out.println("Last element: " + lastElement);

        // Step 5: Create nameLengths array and calculate sum

        // 5.a Create a new array to store the lengths of each name
        int[] nameLengths = new int[names.length];
        for (int i = 0; i < names.length; i++) {
            nameLengths[i] = names[i].length(); // Store the length of each name
        }

        // 5.b Calculate the total of all the lengths
        int nameLengthsSum = 0;
        for (int length : nameLengths) {
            nameLengthsSum += length; // Add each length to the total
        }
        System.out.println("Total of all name lengths: " + nameLengthsSum);

        // Step 6-13: Custom Methods Examples
        System.out.println(repeatWord("Hello", 3)); // 7: Repeat "Hello" 3 times
        System.out.println(fullName("John", "Doe")); // 8: Combine first and last name

        int[] numbers = {10, 20, 30, 40};
        System.out.println(isSumGreaterThan100(numbers)); // 9: Check if total of numbers > 100

        double[] doubleArray = {2.5, 3.5, 4.5};
        System.out.println(calculateAverage(doubleArray)); // 10: Calculate the average of doubleArray

        double[] array1 = {2.5, 3.5, 4.5};
        double[] array2 = {1.5, 2.5, 3.5};
        System.out.println(compareAverages(array1, array2)); // 11: Compare averages of two arrays

        System.out.println(willBuyDrink(true, 20.0)); // 12: Check if conditions are met to buy a drink
        System.out.println(factorial(5)); // 13: Calculate the factorial of 5
    }

    // 7. Method to repeat a word a certain number of times
    public static String repeatWord(String word, int n) {
        StringBuilder result = new StringBuilder(); // Create a blank result
        for (int i = 0; i < n; i++) { // Loop n times
            result.append(word); // Add the word each time
        }
        return result.toString(); // Return the final result
    }

    // 8. Method to combine first and last names
    public static String fullName(String firstName, String lastName) {
        return firstName + " " + lastName; // Combine with a space in between
    }

    // 9. Method to check if the total of numbers is greater than 100
    public static boolean isSumGreaterThan100(int[] numbers) {
        int sum = 0; // Start with 0
        for (int num : numbers) {
            sum += num; // Add each number
        }
        return sum > 100; // Check if it's more than 100
    }

    // 10. Method to calculate the average of a double array
    public static double calculateAverage(double[] numbers) {
        double sum = 0; // Start with 0
        for (double num : numbers) {
            sum += num; // Add each number
        }
        return sum / numbers.length; // Divide by total count
    }

    // 11. Method to compare averages of two arrays
    public static boolean compareAverages(double[] array1, double[] array2) {
        return calculateAverage(array1) > calculateAverage(array2); // Compare averages
    }

    // 12. Method to decide whether to buy a drink
    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
        return isHotOutside && moneyInPocket > 10.50; // Both conditions must be true
    }

    // 13. Method to calculate the factorial of a number
    public static int factorial(int n) {
        if (n == 0 || n == 1) { // Base case: factorial of 0 or 1 is 1
            return 1;
        }
        return n * factorial(n - 1); // Recursive call to calculate factorial
    }
}
