import java.util.Scanner;
class EvenOdd{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a Number :");
		int x=scan.nextInt();
		int y=2;
		int z=x%y;
		
		System.out.print("Number is ");
		 if (z==1) {
            System.out.println("Odd");
        }else{
            System.out.println("Even");
        }
	}
}