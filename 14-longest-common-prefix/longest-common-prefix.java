class Solution {
    public String longestCommonPrefix(String[] strs) {
    String pref = strs[0];
   for(int i = 0 ; i < pref.length() ; i++)
   {
     char pref_ch = pref.charAt(i);
     for(int j = 1; j < strs.length ; j++)
     {
        if(i >= strs[j].length() || strs[j].charAt(i) != pref_ch )
        {
            return pref.substring(0,i);
        }
     }
    }
    return pref;
    }
}