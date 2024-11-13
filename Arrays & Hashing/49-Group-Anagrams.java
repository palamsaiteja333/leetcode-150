class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        // 1. Sorting
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedString = new String(charArray);
            map.putIfAbsent(sortedString, new ArrayList<String>());
            map.get(sortedString).add(s);
        }

        return new ArrayList<>(map.values());
        
    }
}