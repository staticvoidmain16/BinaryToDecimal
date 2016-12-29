/*Yaseen Younus
 * MCS 141
 * 3-3-16
 * */

import java.util.Scanner;

public class BinaryToDecimal 
{
  public static void main(String[] args) 
  {
    Scanner scan = new Scanner(System.in);
    String input;
    boolean valid;
    
    do //Input validation loop
    {
      System.out.println("Enter a binary number: ");
      input = scan.nextLine();
      
      valid = true;
      for(int i = 0; i < input.length(); i++) //Loop through string to verify 0s and 1s
      {
        if(input.charAt(i) != '0' && input.charAt(i) != '1') //Find values not 0 or 1
        {
          valid = false;
        }
      }
    } while(!valid);
    
    
    //Conversion Loop
    int value = 0;
    for(int i = 0; i < input.length(); i++)
    {
      if(input.charAt( input.length() -1 -i) == '1')
        value = value + (int)Math.pow(2, i);
    }
    System.out.println(input + " in binary is " + value + " in decimal.");
  }
}
