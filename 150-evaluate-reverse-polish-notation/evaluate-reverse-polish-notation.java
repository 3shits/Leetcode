import java.util.Stack;
class Solution {
    public int evalRPN(String[] tokens) {

    Stack arr = new Stack<Integer>();
    Integer op1 , op2;
    for(int i = 0 ;  i < tokens.length ; i++)
    {
        switch(tokens[i]){
            case "+":
            op1 = (Integer) arr.pop();
            op2 = (Integer) arr.pop();
            arr.push(op1+op2);
            break;
            case "-":
            op1 = (Integer) arr.pop();
            op2 = (Integer) arr.pop();
            arr.push(op2-op1);
            break;
            case "*":
            op1 = (Integer)arr.pop();
            op2 = (Integer)arr.pop();
            arr.push(op1*op2);
            break;
            case "/":
            op1 = (Integer)arr.pop();
            op2 = (Integer)arr.pop();
            arr.push(op2/op1);
            break;
            default:
            arr.push(Integer.valueOf(tokens[i]));
            break;
        }
    }

    return (int)arr.pop();        
    }
}