class Solution {
    public boolean canPermutePalindrome(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (char ch : s.toCharArray()){
            hashMap.put(ch, hashMap.getOrDefault(ch, 0)+1);
        }

        int count = 1;
        for (char key : hashMap.keySet()){
            if (hashMap.get(key)%2 !=0) count--;
        }

        if (count == 0 || count == 1) return true;
        else return false;
    }
}
