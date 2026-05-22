class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> hashSet = new HashSet<>();
        while(n!=1){
            n = singleDigitSum(n);
            if (n == 1) break;
            else if (hashSet.contains(n)) return false;
            else {
                hashSet.add(n);
            }
        }
        return true;
    }

    private int singleDigitSum(int n){
        int sum = 0;
        while(n!=0){
            int digit = n%10;
            sum += square(digit);
            n /= 10;
        }
        return sum;
    }

    private int square(int n){
        return n*n;
    }
}
