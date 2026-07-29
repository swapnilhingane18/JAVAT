// Arrays in Java
public class Arrays {
    public static void main(String args[]) {

        // Declaring and initializing an array
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("=== Array Basics ===");
        System.out.println("Array Length: " + numbers.length);
        System.out.println("First Element: " + numbers[0]);
        System.out.println("Last Element: " + numbers[numbers.length - 1]);

        // Print all elements
        System.out.println("\n=== All Elements ===");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + " -> " + numbers[i]);
        }

        // Find sum and average
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        double average = (double) sum / numbers.length;

        System.out.println("\nSum: " + sum);
        System.out.println("Average: " + average);

        // 2D Array
        System.out.println("\n=== 2D Array (Matrix) ===");
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
