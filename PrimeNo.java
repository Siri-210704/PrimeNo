// The line `import java.util.Scanner;` is importing the `Scanner` class from the `java.util` package.

// The `Scanner` class is used to read input from the user in Java. By importing this class, we can

// create a `Scanner` object and use its methods to read user input.

import java.util.Scanner;

 

// Define a class

/**

 * The above class is named "primeno" and does not contain any code.

 */

public class primeno {

 

  // Define a method to generate prime numbers

  // The line `public static void prime() {` is defining a method named `prime()`. This method does not

  // return any value (`void`), and it is declared as `public` and `static`, which means it can be

  // accessed from other classes without creating an instance of the `primeno` class.

  public static void prime() {

    // Create a Scanner object

    Scanner sc = new Scanner(System.in);

 

    // Prompt the user to enter the lower and upper bounds of the range

    System.out.println("Enter the lower and upper bounds of the range:");

    int low = sc.nextInt();

    int high = sc.nextInt();

 

    // Use a loop to iterate over the numbers in the range

   // The code `for (int i = low; i <= high; i++)` is a for loop that iterates over the numbers in the

   // range specified by the user. It starts with the value of `low` and continues until it reaches or

   // exceeds the value of `high`.

    for (int i = low; i <= high; i++) {

      // Assume that the current number is prime

      boolean isPrime = true;

 

      // Use a loop to check if the current number has any factors other than 1 and itself

     // The code `for (int j = 2; j < i; j++)` is a nested for loop that checks if the current number

     // `i` has any factors other than 1 and itself.

      for (int j = 2; j < i; j++) {

        // If the current number is divisible by any other number, it is not prime

        if (i % j == 0) {

          isPrime = false;

          break;

        }

      }

 

      // If the current number is prime, print it

      // The code `if (isPrime && i > 1) { System.out.print(i + " "); }` is checking if the current

      // number `i` is prime (`isPrime` is `true`) and greater than 1 (`i > 1`).

      if (isPrime && i > 1) {

        System.out.print(i + " ");

      }

    }

    sc.close();

  }

 

  // Define the main method

  /**

   * The main function calls the prime method.

   */

  public static void main(String[] args) {

    // Call the method

    prime();

  }

}