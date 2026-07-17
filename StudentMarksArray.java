import java.util.Scanner;
class StudentMarksArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int numberOfSubjects = 5;
        int[] marks = new int[numberOfSubjects];
 
        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        int total = 0;
        for (int i = 0; i < numberOfSubjects; i++) {
            total += marks[i];
        }

         float average = (float) total / numberOfSubjects;
 
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
 
    }
}
