import java.util.HashMap;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    HashMap<String,List<String>> check = new HashMap<>();
    char letters[];
    String key;
    for(String str:strs)
    {
        letters =str.toCharArray();
        Arrays.sort(letters);
        key = Arrays.toString(letters);
        if(check.containsKey(key))
        check.get(key).add(str);
        else
        {
            List<String> temp = new ArrayList<>();
            temp.add(str);
            check.put(key,temp);
        }
    }
    return  new ArrayList<List<String>>(check.values());
        
    
    }
}