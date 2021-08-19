package functionalPrograms;
import java.util.Scanner;

public class WindChill {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the temperature in fahrenhiet");
		double t=sc.nextDouble();
		System.out.println("Enter the windspeed in miles per hour");
		double v=sc.nextDouble();
		System.out.println(calWindChill(t,v));
	}
	static double calWindChill(double t, double v) {
		double w=35.74+0.6215*t+(0.4275*t-35.75)*Math.pow(v, 0.16);
		return w;
	}
}
