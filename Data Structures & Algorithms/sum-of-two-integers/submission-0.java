class Solution {
    public int getSum(int a, int b) {
        int carry = 0, sum=0;
        for (int i=0; i<=31; i++){
            int last_a = a&1;
            int last_b = b&1;

            int calBit = last_a ^ last_b ^ carry;
            sum |= (calBit<<i);
            carry = (last_a & last_b) | (last_a & carry) | (last_b & carry);

            a>>=1;
            b>>=1;
        }
        return sum;
    }
}