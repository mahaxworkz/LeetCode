public class StringComparator {
    public static int compareStrings(String str1, String str2) {
        // Check if the second string's size is greater than the first
        if (str2.length() > str1.length()) {
            return -1;
        }

        // Iterate over both strings character by character
        for (int i = 0; i < str1.length(); i++) {
            // If the characters at the current position are not equal, return the position
            if (str1.charAt(i) != str2.charAt(i)) {
                return i;
            }
        }

        // If the loop completes without finding any difference, check if the lengths are equal
        if (str1.length() == str2.length()) {
            return 0; // Both strings are equal
        } else {
            return str1.length(); // Strings are different, and the position of difference is at the end of str1
        }
    }

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        int result = compareStrings(str1, str2);

        if (result == 0) {
            System.out.println("Strings are equal.");
        } else if (result == -1) {
            System.out.println("Second string's size is greater than the first.");
        } else {
            System.out.println("Strings are different. Difference found at position: " + result);
        }
    }
}