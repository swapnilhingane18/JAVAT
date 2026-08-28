import java.util.Scanner;

public class Q28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total_marks = sc.nextInt();
        int given_marks = sc.nextInt();
        
        int req_marks = total_marks - given_marks;

        System.out.println(req_marks);
    }
}
