class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Hashtable<String, List<String>> multiValues = new Hashtable<>();
        List<List<String>> finalArr = new ArrayList<>();

        for (int i=0; i<strs.length; i++){
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if (multiValues.containsKey(key)){
                multiValues.get(key).add(strs[i]);
            } else {
                ArrayList<String> list = new ArrayList<>();
                list.add(strs[i]);
                multiValues.put(key, list);
            }
        }

        for (List<String> list : multiValues.values()) {
            finalArr.add(list);
        }

        return finalArr;
    }
}
