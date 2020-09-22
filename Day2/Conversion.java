package Saurabh;
import java.util.Scanner;
public class Conversion {
public static void main(String args[]) {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter height in Foot :");
	float ht_foot=in.nextFloat();
	System.out.println("Enter hieght in inch :");
	float ht_inch=in.nextFloat();
	System.out.println("Enter weight in kg");
	float wt_kg=in.nextFloat();
	double ht_cm=(ht_foot*12*2.54)+(ht_inch*2.54);
	System.out.println("Height in cm: " +ht_cm);
	double wt_pound=wt_kg*2.2;
	System.out.println("Weight in Pounds: " +wt_pound);
}
}
