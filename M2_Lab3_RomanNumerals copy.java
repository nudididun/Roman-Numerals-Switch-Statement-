/*
Name: Didunoluwa 
Purpose: Demontration of Switch statement. Converting numbers to their respective roman numeral values
Date: Monday 1st March, 2021

*/

import java.util.*;

public class M2_Lab3_RomanNumerals 
{
    public static void main(String [] args)
    {
        Scanner keyboard = new Scanner (System.in);
    
        String prompt = "This proragam will convert any whole number integer, into its equivalent "
                      + "Roman Numeral Value."
                      + "\nPlease enter any integer between 1 and 999\n";
               prompt += "For example, if you want to convert 250, simply type in 250 and hit enter";
               prompt += "\n --> ";
        System.out.print (prompt);
        int number  = keyboard.nextInt();
        
        //number validation
        while (number <1 || number > 999){            
            System.out.println("Please enter a valid number between 1 and 999");  
            number = keyboard.nextInt();
        }
                 
      //digits extraction 
        int digit_unit = number%10;
        int digit_tens = (number/10)%10;
        int digit_hundreds = (number/100)%10;
             
       // for units value
       String romanUnits = "";
       
       switch(digit_unit){
           case 9:
               romanUnits = "IX";
               break;
           case 8:
               romanUnits = "VIII";
               break;
          case 7:
               romanUnits = "VII";
               break;    
          case 6:
               romanUnits = "VI";
               break;     
          case 5:
               romanUnits = "V";
               break;
          case 4:
               romanUnits = "IV";
               break;  
          case 3:
               romanUnits = "III";
               break;
          case 2:
               romanUnits = "II";
               break;      
          case 1:
               romanUnits = "I";
               break;      
        }
                       
        
        // for tens value 
        String romansTens = "";
        switch(digit_tens){
          case 9:
               romansTens = "XC";
               break;
          case 8:
               romansTens = "LXXX";
               break;
          case 7:
               romansTens = "LXX";
               break;    
          case 6:
               romansTens = "LX";
               break;     
          case 5:
               romansTens = "L";
               break;
          case 4:
               romansTens = "XL";
               break;  
          case 3:
               romansTens = "XXX";
               break;
          case 2:
               romansTens = "XX";
               break;      
          case 1:
               romansTens = "X";
               break;                    
        }
        
        
        // for hundreds value
       String romansHundreds = "";
        switch(digit_hundreds){
          case 9:
               romansHundreds = "CM";
               break;
          case 8:
               romansHundreds = "DCCC";
               break;
          case 7:
               romansHundreds = "DCC";
               break;    
          case 6:
               romansHundreds = "DC";
               break;     
          case 5:
               romansHundreds = "D";
               break;
          case 4:
               romansHundreds = "CD";
               break;  
          case 3:
               romansHundreds = "CCC";
               break;
          case 2:
               romansHundreds = "CC";
               break;      
          case 1:
               romansHundreds = "C";
               break;                    
        }
        
        System.out.print ("The isolated values for the number "+number+ " are " +digit_hundreds+ " "+
                digit_tens+ " "+ digit_unit);
        
        System.out.println("\n\nThe Roman Numeral Value for " +number+ " is " + 
                romansHundreds+romansTens+romanUnits);      
        
        System.out.print("\n\nThis program is now terminating. Thank you!");
    }
}
                        
    
