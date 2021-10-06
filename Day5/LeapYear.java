import java.util.Scanner;

public class LeapYear {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter a year")
    int year = sc.nextInt();  // year to be checked

    // if year is divided by 4 or if the year is century
    if (year % 4 == 0) { 
		if (year % 100 != 0 || year % 100 == 0 && year % 400 == 0){
		System.out.println(year + " is a leap year.");
		}
		else {
            System.out.println(year + " is not a leap year.");
			}	
	}
    else { 
		System.out.println(year + " is not a leap year.");
		}

  }
}