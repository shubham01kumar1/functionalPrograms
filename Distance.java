package functionalPrograms;
import java.util.Scanner;
/*
 * Distance.java that takes two integer command-line arguments x
   and y and prints the Euclidean distance from the point (x, y) to the origin (0, 0). The
   formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function
 */

public class Distance {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the x-coordinate");
		int x=sc.nextInt();
		System.out.println("enter the y-coordinate");
		int y=sc.nextInt();
		System.out.println(calDistance(x,y));
	}
	public static double calDistance(int x,int y) {
		double distance=Math.sqrt(Math.pow(x,2)+Math.pow(y, 2));
		return distance;
	}
}