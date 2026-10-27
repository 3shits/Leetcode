class Solution {
    public String simplifyPath(String path) {
        String[] st = new String[path.length()+1];
        int top = -1;
        String token = "";
        st[++top] = "/";
        int i = 1;
        int stInd = 1;
        while(i < path.length())
        {
           if(path.charAt(i) == '/')
           {
                if(stInd != i)
                {
                    token = path.substring(stInd , i);
                    if(token.equals("..") && top > 0)
                    top = top-2 ;
                    if(!token.equals(".") && !token.equals(".."))
                    {
                        st[++top] = token;
                        st[++top] = "/";
                    }
                }
            stInd = i+1;
           }
           i++;
        }
        if(stInd != i)
        {
            token = path.substring(stInd , i);
            if(token.equals("..") && top > 0)
            top = top-2;
            if(!token.equals(".") && !token.equals(".."))
            {
                st[++top] = token;
                st[++top] = "/";
            }
        }
        
        if(top != 0)
        --top;

        String result = "";
        for( i = 0 ; i <= top ; i++)
        {
            result += st[i];
        }

        return result;

    }
}