public class LargestNumber {

    public static void main(String[] args) {

        int n1 = 2, n2 = 3, n3 = 5;

        if(n1 >= n2) { //comparing n1 and n2 first
           if(n1 >= n3){System.out.println(n1 + " is the largest number.");}
           else{System.out.println(n3 + " is the largest number.");}
        } 
		else {
           if(n2 >= n3){System.out.println(n2 + " is the largest number.");}
           else{System.out.println(n3 + " is the largest number.");} 
        }
    }
}