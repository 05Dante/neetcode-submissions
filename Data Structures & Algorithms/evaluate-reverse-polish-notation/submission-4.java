class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        String op = "";
        int a,b;

        for (int i=0; i<tokens.length; i++){
            op = tokens[i];
            switch(op){
                    case "+":
                    stack.push(stack.pop()+stack.pop());
                    break;

                    case "*":
                    stack.push(stack.pop()*stack.pop());
                    break;

                    case "-":
                    a = stack.pop();
                    b = stack.pop();
                    stack.push(b-a);
                    break;

                    case "/":
                    a = stack.pop();
                    b = stack.pop();
                    stack.push(b/a);
                    break;

                    default:
                    stack.push(Integer.parseInt(op));
                    break;
                }
        }
        return stack.pop();
    }
}