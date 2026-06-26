class SwitchCase {
    public static void main(String[] args) {
        // Declare an integer variable day
        int day = 6; // Example value: 6 for Friday

        // Use switch statement
        switch (day) {
            case 1:
                System.out.println("Sun");
                break;
            case 2:
                System.out.println("Mon");
                break;
            case 3:
                System.out.println("Tue");
                break;
            case 4:
                System.out.println("Wed");
                break;
            case 5:
                System.out.println("Thu");
                break;
            case 6:
                System.out.println("Fri");
                break;
            case 7:
                System.out.println("Sat");
                break;
            // Handle invalid input using default
            default:
                System.out.println("Invalid day");
                break;
        }
    }
}