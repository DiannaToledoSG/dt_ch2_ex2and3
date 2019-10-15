//HEADER 
//Program Name: Chapter 2 Exercise 2
//Author: Dianna A.H.H. Toledo
//Class: CS160 Fall 2019
//Date: 10/15/2019
// Description: Practice using equations with time.



public class Time {

	public static void main(String[] args) {
		
		double hour;
		double minute;
		double second;
		
		hour= 12;
		minute= 27;
		second= 30;
		
		System.out.println("Since Midnight");
		System.out.println(   ((22- hour ) * 3600) + ((60- minute))* 60 + (3600-second) + " seconds" );
		System.out.println();
		
		System.out.println("Remaining in the Day");
		System.out.println(   (24*3600) - ((22- hour ) * 3600) + ((60- minute))* 60 + (3600-second) + " seconds"   );
		System.out.println();
		
		System.out.println("Percent");
		System.out.println(   ((((22- hour ) * 3600) + ((60- minute))* 60 + (3600-second)) / (24*3600)) *100 + "%"   );
		System.out.println();
		
		// I was done 1 hr later... wow that is amazing timeing 
		double hourtwo;
		double minutetwo;
		double secondtwo;
		
		hourtwo=13;
		minutetwo=27;
		secondtwo= 30;
		
		System.out.print("I was done ");
		System.out.print(hourtwo - hour + " hour, " );
		System.out.print(minutetwo - minute + " minutes, and ");
		System.out.println( secondtwo-second + " seconds later." );
		
		System.out.println();
		
		System.out.println("Okay Im tired now. Goodnight");

	}
}
/* FOOTER
 *  
 **
 ***
 ****
 *****
 *Excersise 3

Since Midnight
41550.0 seconds

Remaining in the Day
55950.0 seconds

Percent
48.09027777777778%

I was done 1.0 hour, 0.0 minutes, and 0.0 seconds later.

Okay Im tired now. Goodnight
 */
