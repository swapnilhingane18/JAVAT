// If-Else Conditional Statements in Java
public class IfElse {
    public static void main(String args[]) {
        int marks = 75;

        System.out.println("=== If-Else Example ===");
        System.out.println("Marks: " + marks);

        if (marks >= 90) {
            System.out.println("Grade: A+ (Excellent!)");
        } else if (marks >= 80) {
            System.out.println("Grade: A (Very Good)");
        } else if (marks >= 70) {
            System.out.println("Grade: B (Good)");
        } else if (marks >= 60) {
            System.out.println("Grade: C (Average)");
        } else {
            System.out.println("Grade: F (Need Improvement)");
        }

        // Ternary operator
        String result = (marks >= 40) ? "PASS" : "FAIL";
        System.out.println("Result: " + result);
    }
}
