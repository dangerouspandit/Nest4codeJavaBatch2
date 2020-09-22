package Saurabh;
import java.util.Scanner;
public class Bill {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
     System.out.println("Enter Item1 :");
     float Item1=in.nextFloat();
       System.out.println("Enter Item2 :");
       float Item2=in.nextFloat();
       
       System.out.println("Enter Item3 :");
       float Item3=in.nextFloat();
       System.out.println("Enter Tax Percentage :");
        float taxpercentage=in.nextFloat();
       float total=Item1+Item2+Item3;
       float taxamount=(taxpercentage/100)*total;
       float totalamount=taxamount+total;
       System.out.println("Total Amount :" +totalamount);
	}

}
