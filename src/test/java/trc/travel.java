package trc;
public class travel {
	

	    public static String longestPalindrome(String s) {
	        if (s == null || s.length() < 1) {
	            return "";
	        }

	        int start = 0;
	        int end = 0;

	        for (int i = 0; i < s.length(); i++) {
	            int len1 = expandAroundCenter(s, i, i);
	            int len2 = expandAroundCenter(s, i, i + 1);
	            int maxLength = Math.max(len1, len2);

	            if (maxLength > end - start) {
	                start = i - (maxLength - 1) / 2;
	                end = i + maxLength / 2;
	            }
	        }

	        return s.substring(start, end + 1);
	    }

	    private static int expandAroundCenter(String s, int left, int right) {
	        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
	            left--;
	            right++;
	        }
	        return right - left - 1;
	    }

	    public static void main(String[] args) {
	        // Sample Input
	        String inputStr = "abcbabcba";

	        // Get the longest palindromic substring
	        String result = longestPalindrome(inputStr);

	        // Print the result
	        System.out.println(result);  // This should output "abcba"
	    }
	
    }