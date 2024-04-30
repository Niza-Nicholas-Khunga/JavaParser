// This is a demo of a grading system
import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] argv) {
        Scanner scan = new Scanner(System.in);

        System.out.println("This is a grading system that assigns a grade to your score.");
        System.out.println("Enter your score: ");
        double score = scan.nextDouble();

        if (score>= 100.0) {
            System.out.println("Congratulations! You aced the test, A++ for getting" +score);
        } else if (score>= 90.0) {
            System.out.println("Superb job, A+ for getting "+score);
        } else if (score>=80) {
            System.out.println("Lovely work, A for getting "+score);
        } else if (score>=70) {
            System.out.println("Wonderful, B+ for getting "+score);
        } else if (score>=60) {
            System.out.println("Fine work, B for getting "+score);
        } else if (score>=50) {
            System.out.println("Great job, C+ for getting "+score);
        } else if (score>=40) {
            System.out.println("Good effort, C for getting "+score);
        } else if (score<=30) {
            System.out.println("Disappointing, F for getting "+score);
        }

        scan.close();
    }
}
