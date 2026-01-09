import java.util.HashMap;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    HashMap<String,List<String>> check = new HashMap<>();

    for(String str:strs)
    {
        char letters[] = str.toCharArray();
        Arrays.sort(letters);
        String key = Arrays.toString(letters);
        if(check.containsKey(key))
        check.get(key).add(str);
        else
        {
            List<String> temp = new ArrayList<>();
            temp.add(str);
            check.put(key,temp);
        }
    }
    List<List<String>> result = new ArrayList<>(check.values());
        return result;
    
    }
}