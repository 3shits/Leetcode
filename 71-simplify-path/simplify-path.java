import java.util.Stack;
class Solution {
    public String simplifyPath(String path) {
        // String[] st = new String[path.length()+1];
        Stack<String> st = new Stack<>();
        // int top = -1;
        String token = "";
        // st[++top] = "/";
        st.push("/");
        int i = 1;
        int stInd = 1;
        while(i < path.length())
        {
           if(path.charAt(i) == '/')
           {
                if(stInd != i)
                {
                    token = path.substring(stInd , i);
                    if(token.equals("..") && st.size() > 1)
                    {
                        // top = top -2;
                        st.pop();
                        st.pop();
                    }
                    if(!token.equals(".") && !token.equals(".."))
                    {
                        // st[++top] = token;
                        // st[++top] = "/";
                        st.push(token);
                        st.push("/");
                    }
                }
            stInd = i+1;
           }
           i++;
        }
        if(stInd != i)
        {
            token = path.substring(stInd , i);
            if(token.equals("..") && st.size() > 1)
            // top = top-2;
            {
                st.pop();
                st.pop();
            }
            if(!token.equals(".") && !token.equals(".."))
            {
                // st[++top] = token;
                // st[++top] = "/";
                st.push(token);
                st.push("/");
            }
        }
        
        if(st.size() != 1)
        st.pop();
        // --top;

        String result = "";
        // for( i = 0 ; i <= top ; i++)
        // {
        //     result += st[i];
        // }
        while(!st.isEmpty())
        {
            result = st.pop() + result;
        }
        return result;

    }
}