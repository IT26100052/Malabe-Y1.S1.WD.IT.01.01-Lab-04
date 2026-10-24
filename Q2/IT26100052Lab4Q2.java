import java.util.Scanner;

public class IT26100052Lab4Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter exam marks (out of 100): ");
        double examMarks = input.nextDouble();
        
        if (examMarks < 0 || examMarks > 100) {
            System.out.println("Invalid input for exam marks. Terminating program.");
        } else {
            System.out.print("Please enter lab submission marks (out of 100): ");
            double labMarks = input.nextDouble();
            
            if (labMarks < 0 || labMarks > 100) {
                System.out.println("Invalid input for lab marks. Terminating program.");
            } else {
                System.out.print("Please enter the percentage given for the exam: ");
                double examPer = input.nextDouble();
                
                System.out.print("Please enter the percentage given for the lab submission: ");
                double labPer = input.nextDouble();
                
                if ((examPer + labPer) != 100) {
                    System.out.println("The percentages must add up to 100. Terminating program.");
                } else {
                    double finalMark = (examMarks * examPer / 100) + (labMarks * labPer / 100);
                    System.out.println("\nFinal Exam Mark is : " + finalMark);
                }
            }
        }
        input.close();
    }
}