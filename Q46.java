import java.util.Scanner;

public class Q46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int income = sc.nextInt();
        int expenses = sc.nextInt();

        int savings = income - expenses;
        int yearly_savings = savings * 12;

        System.out.println(savings + " " + yearly_savings);
    }
}
