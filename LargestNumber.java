import java.util.Scanner;
class LargestNumber{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter First Number :");
		int x=sc.nextInt();
		System.out.print("Enter Second Number :");
		int y=sc.nextInt();
		System.out.print("Enter Third Number :");
		int z=sc.nextInt();
		
		System.out.println("");
		
		if (x>=y&&x>=z) {
            System.out.println("Largest number is :" +x);
        }
        else if (y>=x&&y>=z) {
            System.out.println("Largest number is :" +y);
        }
        else {
            System.out.println("Largest number is :" +z);
        }
		
	}
}