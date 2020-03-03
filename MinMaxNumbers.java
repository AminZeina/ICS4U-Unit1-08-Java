import java.util.Random;

/**
 * This program generates an array of random numbers from 1-99, then determines the max and min 
 * numbers generated.
 * 
 * @author Amin Zeina
 * @version 1.0
 * @since 2020-03-02
 */

 
public class MinMaxNumbers {
  
  /**
  * This method deteremines the maximum value in the array of random numbers.
  */
 
  public static int findMax(int[] randomArray) {
    
    int maxValue = 0;
    
    // Loop to check each element in array and compare to previous, finding highest value
    for (int counter = 0; counter < randomArray.length; counter++) {
      if (randomArray[counter] > maxValue) {
        // Larger number was found, so replace maxValue
        maxValue = randomArray[counter];
      }
    }
    return maxValue;
  }
  
  /**
  * This method deteremines the minimum value in the array of random numbers.
  */
 
  public static int findMin(int[] randomArray) {
    // Setting to 100 instead of 0 because numbers lower than this need to be found
    int minValue = 100;
    
    // Loop to check each element in array and compare to previous, finding lowest value
    for (int counter = 0; counter < randomArray.length; counter++) {
      if (randomArray[counter] < minValue) {
        // Smaller number was found, so replace minValue
        minValue = randomArray[counter];
      }
    }
    return minValue;
  }
  
  /**
  * This class generates an array of random numbers then calls find max and min methods.
  */
    
  public static void main(String[] args) {
    
    Random random = new Random();
    
    // Create array with 10 elements
    int[] randomArray = new int[10];
    
    // Loop to populate array with random numbers from 0-99
    for (int counter = 0; counter < randomArray.length; counter++) {
      randomArray[counter] = random.nextInt(99) + 1;
    }
    
    System.out.println("The random numbers generated are:");
    // Loop to print each random number generated
    for (int counter = 0; counter < randomArray.length; counter++) {
      System.out.println(randomArray[counter]);
    }
    // Call findMax to get maxValue and show to user
    System.out.println("The maximum value is: " + findMax(randomArray));
    // Call findMin to get minValue and show to user
    System.out.println("The minimum value is: " + findMin(randomArray));
  }  
}