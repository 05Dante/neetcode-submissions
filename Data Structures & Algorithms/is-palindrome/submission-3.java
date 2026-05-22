class Solution {
    public boolean isPalindrome(String s) {
        String s_cleaned = s.replaceAll("[^a-zA-Z0-9]", "");
        s_cleaned = s_cleaned.toLowerCase();
        int s_length = s_cleaned.length()-1;

        if (s_length==-1 || s_length==0) return true;

        for (int i=0; i<=(s_length)/2; i++){
            if (s_cleaned.charAt(i) != s_cleaned.charAt(s_length-i)){
                return false;
            }
        }
        return true;
    }
}
