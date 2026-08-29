import java.util.Scanner;

public class Q31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double mix1 = sc.nextDouble();
        double conc1 = sc.nextDouble();

        double mix2 = sc.nextDouble();
        double conc2 = sc.nextDouble();

        double pure_juice1 = mix1 * (conc1/100);
        double pure_juice2 = mix2 * (conc2/100);

        double total_pure_juice = pure_juice1 + pure_juice2;

        double total_volume = mix1 + mix2;

        double final_concentration = (total_pure_juice/total_volume) * 100;

        System.out.println((int)final_concentration);

    }
}
