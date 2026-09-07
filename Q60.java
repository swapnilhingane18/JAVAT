import java.util.Scanner;

public class Q60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int volume = sc.nextInt();
        int loss_percent = sc.nextInt();

        int remaining_volume = volume - (volume * loss_percent/100);

        System.out.println(remaining_volume);
    }
}
