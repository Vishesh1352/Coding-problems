class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder result = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (Character.isLetter(ch) || Character.isDigit(ch)) {
                result.append(ch);
            }
        }
        int j = result.length() - 1;
        for (int i = 0; i < result.length() / 2; i++) {
            if (result.charAt(i) != result.charAt(j)){
                return false;
            }
            j--;
        }

        return true;
    }
}