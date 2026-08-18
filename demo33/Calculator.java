import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n*****************Calculator******************");
            System.out.print("Enter an operand 1 : ");
            double op1 = sc.nextDouble();

            System.out.print("Enter an operator : ");
            char opr = sc.next().charAt(0);

            System.out.print("Enter an operand 2 : ");
            double op2 = sc.nextDouble();

            double op = (opr == '+') ? (op1 + op2)
                    : ((opr == '-') ? (op1 - op2)
                            : ((opr == '*') ? (op1 * op2)
                                    : ((opr == '/') ? (op1 / op2)
                                            : ((opr == '%') ? (op1 % op2) : (Double.MAX_VALUE)))));

            System.out.print(
                    (op == Double.MAX_VALUE) ? ("Invalid Operator") : (op1 + " " + opr + " " + op2 + " = " + op));

        }
        // sc.close();
    }
}
