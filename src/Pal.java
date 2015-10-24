/********************
 * Timothy Shine    *
 * Palindrome Lab   *
 * 10/20/2015       *
 ********************/

import java.util.Scanner;

public class Pal
{
   public static void main (String[] args)
   {
    
	  //Takes in user input as String
	  Scanner input = new Scanner(System.in);
      boolean notFinished = false;
      do
      {
    	  
    	 //Outputs of String, is Palindrome and Almost Palindrome
         System.out.print("Enter a string  ===>>  ");
         String str = input.nextLine();
         System.out.println();
         System.out.println("Entered String:     " + str);
         System.out.println("Palindrome:         " + Palindrome2.isPal(str));
         System.out.println("Almost Palindrome:  " + Palindrome2.almostPal(str));   
         System.out.print("Do you wish to repeat this program [Y/N]?  ===>>  ");
         String repeat = input.nextLine();
         notFinished = (repeat.equals("Y")) || (repeat.equals("y"));
         System.out.println();
      }
      while (notFinished);
   }
}




class Palindrome2
{
 
	//Checks if the String is a Palindrome
   public static boolean isPal(String s)
   {
	   
	     //To Lowercase  
	     String lowerCase = s.toLowerCase(); 
	     String backwards = new String(); 
	     
	     //Outputs String backwards
	     for(int j = lowerCase.length()-1; j>=0; j--){
	    	backwards += lowerCase.charAt(j);
	    	backwards += "";
	  		}
	   
	    //Checks if it is a Palindrome 	     	
		if(backwards.equals(lowerCase))
		  return true; 
	   
		
		
		  return false; 
   } 
   
   
   //Checks if the character is a letter
   private static boolean isLetter(char letter)
   {
	  	if(letter >= 'a' && letter <= 'z')
		   	return true;
		 return false;

   }
   
  
   //Removes all non letters
   private static String purge(String s)
   {
	   String lower = s.toLowerCase();
	   String purged = "";
	   
	   //Goes through String and if it is a character at the index, it adds it to the purge string
	   for(int k = 0;k <= lower.length() - 1;k++)
	   	{
		   if(isLetter(lower.charAt(k))== true)
			   purged += lower.charAt(k);
	   	}
	   return purged;

	   
   }
   
 
   //Returns if it is almost a Palindrome
   public static boolean almostPal(String s)
   {
	   	 //It can only be almost a Palindrome if it isnt already a Palindrome
	   	 if(isPal(s) == false)
	   		return isPal(purge(s));
	   	 return false;
	   	 }
	   		 
   }



