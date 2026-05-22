class Solution {
    public int findLucky(int[] arr) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int n: arr){
            hashMap.put(n, hashMap.getOrDefault(n, 0)+1);
        }

        for (int key: hashMap.keySet()){
            if (hashMap.get(key)==key){
                list.add(key);
            }
        }
        
        if (list.size()==0){
            return -1;
        } else {
            Collections.sort(list);
            return list.get(list.size()-1);
        }
    }
}