import java.util.Scanner;
class SimpleCalculator{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter First Number :");
		int No=scan.nextInt();
	
		System.out.print("Enter Second Number :");
		int No1=scan.nextInt();
		
		System.out.println("");
		System.out.println("Choose Operation :");
		System.out.println("1.Addition (+)");
		System.out.println("2.Subtraction (-)");
		System.out.println("3.Multiplication (*)");
		System.out.println("4.Division (/)");
		
		
		 System.out.print("Enter Your Choice :");
		 int No2=scan.nextInt();
		 System.out.print("Result =");
		 
		 switch (No2){
            case 1:
                System.out.println(No+No1);
                break;
            case 2:
                System.out.println(No-No1);
                break;
            case 3:
                System.out.println(No*No1);
                break;
            case 4:
                System.out.println(No/No1);
                break;
         }   
		
		
	}
}

