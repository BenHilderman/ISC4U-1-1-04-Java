import java.util.Scanner;
/**
 * Class Mic
 * This code calculates the amount of time it takes to microwave an item.
 * @author  BenHilderman
 * @version 1.0
 * @since   2020-02-23 
 */

public class Mic {
  // Variables 
  static double userItem;
  static double time;
  static double amountOfTheItem;
  
  /**
  * Calculates and outputs the amount of time depending on the item and how many of said item.
  */
  
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);

    // User inputs item they want to microwave (Sub, Pizza, or Soup)
    System.out.println("Are you heating a Sub, Pizza, or Soup?");

    // Try and catch sequence
    try { 
      String item = userInput.nextLine(); 
      if (item.equals("Sub") || item.equals("Pizza") || item.equals("Soup")) {
        
        // if user inputs Sub      
        if (item.equals("Sub")) {
          userItem =  1;

        // if user inputs Pizza     
        } else if (item.equals("Pizza")) {
          userItem =  .75;

        // if user inputs Soup      
        } else if (item.equals("Soup")) {
          userItem =  1.75;

        }
        
        System.out.println("How many " + item + "(s) are you heating?");

        // Try and catch sequence
        try { 
          amountOfTheItem = userInput.nextInt(); 

          if (amountOfTheItem == 1 || amountOfTheItem == 2 || amountOfTheItem == 3) {
            time = ((amountOfTheItem - 1) / 2 + 1) * userItem;
            System.out.println("It will take " + time + " minutes to microwave " 
                + amountOfTheItem + " " + item + ".");

        
          } else {
            System.out.println("Invalid input, only 1-3 items at a time.");
          }
        
        // Catch sequence for amount of the item  
        } catch (Exception e) {
          System.out.println("Invalid input, only 1-3 items at a time.");
        }
        
      } else {
        // When user input is not Sub, Pizza, or Soup 
        System.out.println("Invalid input, please enter one of the three items.");
      }

    // Catch sequence for chosen item       
    } catch (Exception e) {
      System.out.println("Invalid input, please enter one of the three items.");

    }
  }
}