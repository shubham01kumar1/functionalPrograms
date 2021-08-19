package functionalPrograms;
import java.util.Scanner;

//program Quadratic.java to find the roots of the equation a*x*x + b*x + c.
public class Quadratic {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a of quadratic equation");
		double a=sc.nextDouble();
		
		if(a==0) {
			System.out.println("Invalid input, value of a cannnot be zero");
			System.out.println("Please enter the value of a again");
			a=sc.nextDouble();
		}
		
		System.out.println("Enter the value of b of quadratic equation");
		double b=sc.nextDouble();
		System.out.println("Enter the value of c of quadratic equation");
		double c=sc.nextDouble();
		solveQuad(a,b,c);
	}
	static void solveQuad(double a,double b,double c) {
		double delta=Math.pow(b, 2)-(4.0*a*c);
		if(delta>=0) {
			double root1=(-b+Math.sqrt(delta))/(2*a);
			double root2=(-b-Math.sqrt(delta))/(2*a);
			System.out.println("roots of Quadratic equation are:"+root1+" "+root2);
		}
		else
			System.out.println("no real root exits for this Quadratic Equation");
	}
}
