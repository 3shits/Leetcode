class Solution {
    public void reverseString(char[] s) {
        int i = 0;
        int l = s.length;
        while(i < l/2)
        {

            char temp = s[i];
            s[i] = s[l-i-1];
            s[l-i-1] = temp;

            i++;
        }

    }
}