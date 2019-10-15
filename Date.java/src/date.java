//HEADER 
//Program Name: Chapter 2 Exercise 2
//Author: Dianna A.H.H. Toledo
//Class: CS160 Fall 2019
//Date: 10/15/2019
// Description: Create a code using string concatenation to display values of different types


public class date {

	public static void main(String[] args) {
		System.out.println("Excersise 2\n");
	
		System.out.println("The 2017, 2018, VEX Robotics competition!..");
		System.out.println("In the Zone!\n");
			
		String day;
		String date;
		String month;
		String year;
		String comma;
		
		day = "Tuesday" ;
		comma= ",";
		date= " 15";
		month= " October";
		year=" 2019";
		
		System.out.println("American Format");
		System.out.println(day + comma+ month + date + comma + year);
		System.out.println("European Format");
		System.out.println(day  + date + month + date  + year);
		
	}
}
/* FOOTER
 *  
 **
 ***
 ****
 *****
 *Excersise 2

The 2017, 2018, VEX Robotics competition!..
In the Zone!

American Format
Tuesday, October 15, 2019
European Format
Tuesday 15 October 15 2019
 */