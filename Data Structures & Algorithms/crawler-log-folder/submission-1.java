class Solution {
    public int minOperations(String[] logs) {
        Stack<String> stack = new Stack<>();
        int count=0;

        for (int i=0; i<logs.length; i++){
            if (logs[i].equals("../") && (!stack.isEmpty())) {
                stack.pop();
                count--;
            }
            else if (logs[i].equals("../") && (stack.isEmpty()) || logs[i].equals("./")) continue;
            else {
                stack.push(logs[i]);
                count++;
            }
        }
        return count;
    }
}