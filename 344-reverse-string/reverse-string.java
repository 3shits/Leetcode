class Solution {
    public void reverseString(char[] s) {
        int i = 0, j =  s.length -1;
        
        while(i < j)
        {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            // s[i] = (char)((int)s[i] + (int)s[j]);
            // s[j] = (char)((int)s[i] - (int)s[j]);
            // s[i] = (char)((int)s[i] - (int)s[j]);
            i++;
            j--;
        }

    }
}