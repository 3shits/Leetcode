class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        int i = 0;
        String res = "";
        
        
            while(i < Math.min(word2.length(),word1.length()))
        {
            res += word1.charAt(i) + "" +word2.charAt(i) ;
            i++;
        }

        if(word1.length() >word2.length())
            res += word1.substring(i);
        if(word1.length() < word2.length())
            res += word2.substring(i);
            

        return res;
    }
}