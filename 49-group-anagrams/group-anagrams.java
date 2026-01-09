class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Double,ArrayList<String>> check = new HashMap<>();
        for(String str:strs)
        {
            double mapping = 0;
            for(int j = 0;  j < str.length() ; j++)
            {
                mapping += Math.exp(str.charAt(j) - 96);
            }
            mapping = Math.round(mapping* 100)/100.0;
            ArrayList<String> temp = check.getOrDefault(mapping,null);
            if(temp == null)
            {
                temp = new ArrayList<String>();
                temp.add(str);
                check.put(mapping,temp);
            }
            else
            temp.add(str);
        }
        List<List<String>> result = new ArrayList<>(check.values());
        return result;

    }
}
