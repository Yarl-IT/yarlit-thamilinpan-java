import java.util.Scanner;
class GradeCalculator{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter Marks For Subject 1 :");
		int x=scan.nextInt();
		System.out.print("Enter Marks For Subject 2 :");
		int y=scan.nextInt();
		System.out.print("Enter Marks For Subject 3 :");
		int z=scan.nextInt(); 
		
		int average=(x+y+z)/3;
		
		
		 
        if (average >= 75) {
            System.out.println("Grade: A");
        } else if (average >= 65) {
            System.out.println("Grade: B");
        } else if (average >= 55) {
            System.out.println("Grade: C");
        } else if (average >= 35) {
            System.out.println("Grade: S");
        } else {
            System.out.println("Grade: F");
        }

	}
}
