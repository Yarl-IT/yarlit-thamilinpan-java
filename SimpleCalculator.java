import java.util.Scanner;
class SimpleCalculator{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int No =0;
		System.out.print("Enter First Number :");
		No=scan.nextInt();
		
		Scanner Number=new Scanner(System.in);
		int No1 =0;
		System.out.print("Enter Second Number :");
		No1=Number.nextInt();
		
		System.out.println("");
		System.out.println("Choose Operation :");
		System.out.println("1.Addition (+)");
		System.out.println("2.Subtraction (-)");
		System.out.println("3.Multiplication (*)");
		System.out.println("4.Division (/)");
		
		 int No2 = 4;
		 Scanner Number2=new Scanner(System.in);
		 System.out.print("Enter Your Choice :");
		 No2=Number2.nextInt();
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

