public class StringMethods {

    public static void main(String[] args) {
        String str = "Hello, world!";
        // Print the length of the string
        System.out.println("Length of the string: " + str.length());
        // Trim the string
        String trimmedString = str.trim();
        System.out.println("Trimmed string: " + trimmedString);
        // Convert the string to upper case
        String upperCaseString = str.toUpperCase();
        System.out.println("Upper case string: " + upperCaseString);
        // Get a sub-string from given indices
        String subString = str.substring(6, 11);
        System.out.println("Substring: " + subString);
        // Reverse the string
        String reversedString = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed string: " + reversedString);
    }
}
