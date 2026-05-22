class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        String op = "";

        for (int i=0; i<tokens.length; i++){
            if (isInteger(tokens[i])){
                stack.push(Integer.parseInt(tokens[i]));
            } 
            else {
                op = tokens[i];
            switch(op){
                case "+":
                stack.push(stack.pop()+stack.pop());
                break;

                case "-":
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b-a);
                break;

                case "*":
                stack.push(stack.pop()*stack.pop());
                break;

                case "/":
                int num1 = stack.pop();
                int num2 = stack.pop();
                if (num2!=0){
                    stack.push(num2/num1);
                } else stack.push(0);
                break;
            }
            }
        }
        return stack.pop();
    }

    public static boolean isInteger(String str) {
    try {
        Integer.parseInt(str);
        return true;
    } catch (NumberFormatException e) {
        return false;
    }
}
}
