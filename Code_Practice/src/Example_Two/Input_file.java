package Example_Two;

import java.util.Scanner; // Import the Scanner class to read text files 
import java.io.*;

public class Input_file {

	public static void main(String[] args) {
  int year;
  Scanner scan =new Scanner (System.in);
  System.out.println("enter year: ");
  year = scan.nextInt();
  boolean leap = false;
  
  if (year % 4 == 0)
  {
	  if(year % 100 == 0)
	  {
		  if(year % 400 ==0)
			  leap = true;
		  else
			  leap = false;
	  }
	  else
	  {
		  leap = true ; 
	  }
  }
  else {
	  leap = false;
  }
  
  if (leap == true)
  {
	  System.out.println("Leap year!! " + year );
  }
  else
  {
	  System.out.println("Not leap!! " + year);
  }
     }
}