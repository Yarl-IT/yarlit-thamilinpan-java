import java.util.Scanner;
class ShoppingBill{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter item Price :");
		int x =sc.nextInt();
		System.out.print("Enter Quantity :");
		int y=sc.nextInt();
		
		 if (x>=5000) {
            System.out.println("Discount applied (10%)");
			System.out.println("Total Bill Amount :"+(x-(x*0.1)));
			
         }else{
			 System.out.println("Total Bill Amount :"+x);
		 }
            
		   
		
	}
}