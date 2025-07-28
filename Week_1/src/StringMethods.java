public class StringMethods {
    public static void main(String[] args) {
        String str = "Hello Java";

        // 1. Length of the string
        System.out.println("Length: " + str.length());  // 10

        // 2. Character at index 0
        System.out.println("Char at index 0: " + str.charAt(0));  // H

        // 3. Substring from index 0 to 5 (not including 5)
        System.out.println("Substring(0, 5): " + str.substring(0, 5));  // Hello

        // 4. Convert to uppercase
        System.out.println("Uppercase: " + str.toUpperCase());  // HELLO JAVA

        // 5. Convert to lowercase
        System.out.println("Lowercase: " + str.toLowerCase());  // hello java

        // 6. Check if string contains a word
        System.out.println("Contains 'Java'? " + str.contains("Java"));  // true

        // 7. Replace a word
        System.out.println("Replace Java with World: " + str.replace("Java", "World"));  // Hello World

        // 8. Check if string starts with "Hello"
        System.out.println("Starts with 'Hello'? " + str.startsWith("Hello"));  // true

        // 9. Check if string ends with "Java"
        System.out.println("Ends with 'Java'? " + str.endsWith("Java"));  // true

        // 10. Find index of a character
        System.out.println("Index of 'J': " + str.indexOf('J'));  // 6

        // 11. Trim leading and trailing spaces
        String spaced = "   Hello Java   ";
        System.out.println("Trimmed: '" + spaced.trim() + "'");  // 'Hello Java'
    }
}

