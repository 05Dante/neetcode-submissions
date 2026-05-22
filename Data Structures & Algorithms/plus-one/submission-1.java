class Solution {
    public int[] plusOne(int[] digits) {
        int end = digits.length-1;
        if (digits[end]!=9){
            digits[end]++;
            return digits;
        }
        else {
            List<Integer> arr = new ArrayList<>();
            int carry = 1;
            arr.add(0, 0);

            for (int i=end-1; i>-1; i--){
                if (digits[i]+carry != 10){
                    arr.add(0, digits[i]+carry);
                    carry = 0;
                } else {
                    arr.add(0, 0);
                }
            }
            if (arr.get(0)==0) arr.add(0,1);
            return arr.stream().mapToInt(Integer::intValue).toArray();

        }
    }
}
