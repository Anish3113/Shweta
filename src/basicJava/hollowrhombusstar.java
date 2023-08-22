package basicJava;
import java.util.Scanner;

public class hollowrhombusstar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter Hollow Rhombus Pattern Rows: ");
		int r=sc.nextInt();
		System.out.println("Printing Hollow Rhombus Pattern : ");
		
		for(int i=1;i<=r;i++) 
		{
			for(int j=1;j<=r-i;j++)
				{
					System.out.print(" ");
				}
			for(int k=1; k<=r;k++) 
			{
				if(i==1||i==r||k==1||k==r)
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
				

	}

}
