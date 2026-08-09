class Solution {
    public boolean isValid(String s) {
        char stack[] = new char[10000];
        int tail = 0;
        for(char c: s.toCharArray())
        {
            if(tail < 0)
            break;

            if(c == ')'&& stack[tail] == '(') 
                --tail;

            else if(c == '}'&& stack[tail] == '{')
                --tail;
            else if(c == ']'&& stack[tail] == '[')
                --tail; 
            else
            stack[++tail] = c;
        }

        return tail==0;
    }
}