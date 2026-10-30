class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        int i = 0;
        StringBuilder res = new StringBuilder();
    
            while(i < Math.min(word2.length(),word1.length()))
        {
            res.append(word1.charAt(i));
            res.append(word2.charAt(i));
            i++;
        }

        if(word1.length() >word2.length())
            res.append(word1.substring(i));
        if(word1.length() < word2.length())
            res.append(word2.substring(i));
            
        return res.toString();
    }
}