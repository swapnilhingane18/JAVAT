// String Operations in Java
public class StringOperations {
    public static void main(String args[]) {
        String str = "Hello, Java World!";

        System.out.println("=== String Operations ===");
        System.out.println("Original: " + str);
        System.out.println("Length: " + str.length());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Char at index 7: " + str.charAt(7));
        System.out.println("Substring (7, 11): " + str.substring(7, 11));
        System.out.println("Contains 'Java': " + str.contains("Java"));
        System.out.println("Index of 'World': " + str.indexOf("World"));
        System.out.println("Replace 'Java' with 'Python': " + str.replace("Java", "Python"));
        System.out.println("Trim: " + "  spaces  ".trim());

        // String comparison
        System.out.println("\n=== String Comparison ===");
        String a = "hello";
        String b = "Hello";
        System.out.println("a.equals(b): " + a.equals(b));
        System.out.println("a.equalsIgnoreCase(b): " + a.equalsIgnoreCase(b));

        // StringBuilder
        System.out.println("\n=== StringBuilder ===");
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" is");
        sb.append(" awesome!");
        sb.insert(0, "Learning ");
        System.out.println(sb.toString());
        System.out.println("Reversed: " + sb.reverse());
    }
}
