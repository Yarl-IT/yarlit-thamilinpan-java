import java.util.Scanner;
public class SwapTwoNumbers{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Value of x: ");
		int x= sc.nextInt();
		
		System.out.print("Enter Value of y: ");
		int y= sc.nextInt();
		
		System.out.println("Before swapping:  x="+x+",y="+y);
		
		int temp=x;
		x=y;
		y=temp;
		
		System.out.println("After swapping: x="+x+",y="+y);	
	}
}