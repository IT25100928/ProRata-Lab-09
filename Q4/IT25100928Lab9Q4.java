import java.util.Scanner;

public class IT25100928Lab9Q4 {
    public static double calcFinalMark(double assignmentMark, double examMark) {
        return (assignmentMark * 0.30) + (examMark * 0.70);
    }

    public static char findGrades(double finalMark) {
        if (finalMark >= 75) {
            return 'A';
        } else if (finalMark >= 60) {
            return 'B';
        } else if (finalMark >= 50) {
            return 'C';
        } else {
            return 'F';
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] names = new String[5];
        double[] finalMarks = new double[5];
        char[] grades = new char[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Name of Student " + (i + 1) + ": ");
            names[i] = scanner.next();
            
            System.out.print("Enter Assignment Mark (out of 100) for " + names[i] + ": ");
            double assignment = scanner.nextDouble();
            
            System.out.print("Enter Exam Paper Mark (out of 100) for " + names[i] + ": ");
            double exam = scanner.nextDouble();

            finalMarks[i] = calcFinalMark(assignment, exam);
            grades[i] = findGrades(finalMarks[i]);
        }

        System.out.println("\nName\t\t | Final Mark\t | Grade");
        for (int i = 0; i < 5; i++) {
            System.out.printf("%-15s | %-13.2f | %-5c\n", names[i], finalMarks[i], grades[i]);
        }

        scanner.close();
    }
}