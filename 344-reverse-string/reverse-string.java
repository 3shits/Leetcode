class Solution {
    public void reverseString(char[] s) {
        int i = 0;
        
        while(i < s.length/2)
        {

            char temp = s[i];
            s[i] = s[s.length-i-1];
            s[s.length-i-1] = temp;

            i++;
        }

    }
}