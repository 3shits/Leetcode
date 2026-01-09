class Solution {
    public String longestCommonPrefix(String[] strs) {
    String pref = strs[0];
    if(pref.equals("") || strs.length < 2)
    return pref;

    for(int i = 1; i < strs.length ;i++)
    {
        String str = strs[i];
        String p = "";
        for(int j = 0; j < str.length(); j++)
        {
            if(j == pref.length() - 1 && pref.length() < str.length())
            {
            if(str.charAt(j) != pref.charAt(j))
            break;
            else
            p = p + pref.charAt(j);
            break;
            }
            if(str.charAt(j) != pref.charAt(j))
            break;
            else
            p = p + pref.charAt(j);
        }
        pref = p;
        if(pref.equals(""))
        break;
    }

    return pref;
    
    }
}