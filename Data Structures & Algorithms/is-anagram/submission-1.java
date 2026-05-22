class Solution {
    public boolean isAnagram(String s, String t) {
        Hashtable<Character, Integer> hashTable = new Hashtable<>();
        int s_length = s.length();
        int t_length = t.length();
        if (s_length != t_length) return false;

        for (int i=0; i<s_length; i++){
            hashTable.put(s.charAt(i), hashTable.getOrDefault(s.charAt(i), 0)+1);
        }

        for (int i=0; i<t_length; i++){
            if (hashTable.containsKey(t.charAt(i))){
                if (hashTable.get(t.charAt(i))==0){
                return false;
            } else {
                hashTable.put(t.charAt(i), hashTable.get(t.charAt(i))-1);
            }
            } else {
                return false;
            }
        }
        return true;
    }
}
