import java.util.HashMap;
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
        return false;
        HashMap<Character,Integer> seen = new HashMap<>();
        for(char c: s.toCharArray())
        seen.put(c,seen.getOrDefault(c,0)+1);
        for(char c: t.toCharArray())
        {
            seen.put(c,seen.getOrDefault(c,0)-1);
            if(seen.get(c) < 0)
            return false;
        }
        return true;
    }
}