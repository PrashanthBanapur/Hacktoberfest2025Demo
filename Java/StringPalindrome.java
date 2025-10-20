public class StringPalindrome {
    public static boolean isPalindrome(String str) {
        // Remove spaces and convert to lowercase for case-insensitive comparison
        String cleanedStr = str.replaceAll("\\s+", "").toLowerCase();
        
        // Reverse the string
        String reversedStr = new StringBuilder(cleanedStr).reverse().toString();
        
        // Compare the original (cleaned) string with the reversed string
        return cleanedStr.equals(reversedStr);
    }
