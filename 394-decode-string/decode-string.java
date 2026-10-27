import java.util.Stack;
class Solution {
    

    public String decodeString(String s) {
        Stack<String> st = new Stack<>();

        for(Character a : s.toCharArray())
        {
            if(a == ']')
            {
                String seq = "";
                String mul = "";
                String check = st.pop();
                while(!check.equals("["))
                {
                    seq =  check + seq;
                    check = st.pop();
                }
               
                while(Character.isDigit(st.peek().charAt(0)))
                {
                    check = st.pop();
                    mul = check + mul;
                    if(st.isEmpty())
                    break;
                    
                }
                
                st.push(seq.repeat(Integer.parseInt(mul)));

            }
            else
            st.push(a+"");
        }

        String res = "";
        while(!st.isEmpty())
        {
            res = st.pop() +res;
        }
        return res;

        
    }
}