class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for (int i=nums2.length-1; i>-1; i--){
            while ((!stack.isEmpty()) && stack.peek()<=nums2[i]){
                stack.pop();
            }

            if (!stack.isEmpty()){
                hashMap.put(nums2[i], stack.peek());
            } else {
                hashMap.put(nums2[i], -1);
            }

            stack.push(nums2[i]);
        }

        for (int i=0; i<nums1.length; i++){
            nums1[i] = hashMap.get(nums1[i]);
        }

        return nums1;
    }
}