class Solution {
    public boolean validPalindrome(String s) {
        int i = 0 , j = s.length()-1;
        boolean removedj = false;
        boolean removedi = false;
        int remi = 0 , remj = 0;
        while(i<j)
        {
            if(s.charAt(i) != s.charAt(j))
            {
                if(!removedi)
                {
                    remi = i;
                    remj = j;
                    i++;
                    removedi = true;
                    continue;
                }
                else
                {
                    if(!removedj)
                    {
                            i = remi;
                            j = remj - 1;
                            removedj = true;
                            continue;
                    }
                    else
                    return false;
                }
            }
            i++;
            j--;
            
        }
        return true;
    }
}