import java.util.Random;
import java.text.DecimalFormat;

public class LineComparison{
    public static void main(String[] arg){
	  //Line Comparison
	  Random rd = new Random();
	  int x1=rd.nextInt(10); int x2=rd.nextInt(10); //getting end points of lines
	  int y1=rd.nextInt(10); int y2=rd.nextInt(10); 
	  
	  System.out.printf("\nLine end points\n(x1=%d, y1=%d)\n(x2=%d, y2=%d)\n",x1,y1,x2,y2);
	    //used decimal format to limit numbers after decimal
	  DecimalFormat df = new DecimalFormat("#.00");	  
	  double length = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
	  System.out.println("Length of the Line is "+df.format(length));
    }
}