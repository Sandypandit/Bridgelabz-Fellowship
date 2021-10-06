import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		//taking input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
		//checking the input for even or odd
        if(num % 2 == 0) { System.out.println(num + " is even");}
        else { System.out.println(num + " is odd");}
    }
}