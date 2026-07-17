class Solution {
    public boolean isPalindrome(String s) {
        int st = 0;
        int end = s.length() - 1;
        
        while (st < end) {
            // Skip non-alphanumeric characters from the left
            while (st < end && !Character.isLetterOrDigit(s.charAt(st))) {
                st++;
            }
            // Skip non-alphanumeric characters from the right
            while (st < end && !Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            }
            // Compare characters (case-insensitive)
            if (Character.toLowerCase(s.charAt(st)) != Character.toLowerCase(s.charAt(end))) {
                return false;
            }
            st++;
            end--;
        }
        return true;
    }
}