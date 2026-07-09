import java.util.Scanner;
class PasswordChecker{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String CorrectCode="Tamil";
		 int attempts = 3;

        while (attempts > 0) {

            System.out.print("Enter password: ");
            String password = sc.nextLine();

            if (password.equals(CorrectCode)) {
                System.out.println("Access Granted");
                break;
            } else {
                attempts--;

                if (attempts > 0) {
                    System.out.println("Wrong password. Attempts left: " + attempts);
                } else {
                    System.out.println("Access Blocked");
                }
            }
		}	
		
	}
}