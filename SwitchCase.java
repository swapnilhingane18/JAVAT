// Switch-Case Statement in Java
public class SwitchCase {
    public static void main(String args[]) {
        int day = 4;

        System.out.println("=== Switch-Case: Day of Week ===");
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday - Weekend!");
                break;
            case 7:
                System.out.println("Sunday - Weekend!");
                break;
            default:
                System.out.println("Invalid day number");
        }

        // Switch with String
        System.out.println("\n=== Switch with String ===");
        String month = "March";
        switch (month) {
            case "January":
            case "February":
            case "March":
                System.out.println(month + " is in Q1");
                break;
            case "April":
            case "May":
            case "June":
                System.out.println(month + " is in Q2");
                break;
            default:
                System.out.println(month + " is in Q3/Q4");
        }
    }
}
