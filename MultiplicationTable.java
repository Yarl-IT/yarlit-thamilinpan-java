import java.util.Scanner;
class MultiplicationTable{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a number: ");
        int num = sc.nextInt();

        for (int x=1;x<= 10;x++) {
            System.out.println(num+"x"+x+"="+(num*x));
        }
	}
}