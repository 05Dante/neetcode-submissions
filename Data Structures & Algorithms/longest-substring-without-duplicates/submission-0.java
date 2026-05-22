class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> hash = new HashSet<>();
        int left=0, right=0, count=0;
        while (right < s.length()){
            if (!hash.contains(s.charAt(right))){
                hash.add(s.charAt(right));
                count = Math.max(count, hash.size());
                right++;
            } else {
                hash.remove(s.charAt(left));
                left++;
            }
        }
        return count;
    }
}
