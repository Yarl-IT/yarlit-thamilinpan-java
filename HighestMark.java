class HighestMark{
    public static void main(String[] args){
        int[] marks = {89, 78, 90, 67, 88, 56};

        int max = marks[0];

        for (int i = 1; i < marks.length; i++){
            if (marks[i] > max) {
                max = marks[i];
            }
        }
        System.out.println("Highest Mark: " + max);
    }
}