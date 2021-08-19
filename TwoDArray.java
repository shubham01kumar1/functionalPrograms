package functionalPrograms;
import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of Rows and Columns!!!");
		int rows = scan.nextInt();
		int columns = scan.nextInt();
		int [][] array = new int[rows][columns];
		
		for(int i=0;i<rows;i++){
			System.out.println("Enter the elements for "+(i+1)+"th row.");
			for(int j=0;j<columns;j++){
				array[i][j]=scan.nextInt();
		    }
		}
		
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
		        System.out.print(+array[i][j]+" ");
		            }
			System.out.print("\n");
		}
	}
}