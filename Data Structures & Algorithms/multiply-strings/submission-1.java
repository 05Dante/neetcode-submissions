class Solution {
    public String multiply(String num1, String num2) {
        long n1 = Integer.parseInt(num1);
        long n2 = Integer.parseInt(num2);

        long prod = n1*n2;

        return String.valueOf(prod);
    }
}
