class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        // 1. Sorting
        // TC: m*nlogn
        // SC: m*n
        // Map<String, List<String>> map = new HashMap<>();
        // for(String s : strs){
        //     char[] charArray = s.toCharArray();
        //     Arrays.sort(charArray);
        //     String sortedString = new String(charArray);
        //     map.putIfAbsent(sortedString, new ArrayList<String>());
        //     map.get(sortedString).add(s);
        // }
        // return new ArrayList<>(map.values());

        // 2. Optimal solution using HashMap
        Map<String, List<String>> resultList = new HashMap<>();
        for(String s : strs){
            int[] key = new int[26];
            for(int i=0; i<s.length(); i++){
                key[s.charAt(i) - 'a']++;
            }

            String keyString = Arrays.toString(key);
            resultList.putIfAbsent(keyString, new ArrayList<String>());
            resultList.get(keyString).add(s);
        }

        return new ArrayList<>(resultList.values());        
    }
}