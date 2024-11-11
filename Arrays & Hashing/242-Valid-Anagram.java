class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        // 1. Sorting
        // char[] sArray = s.toCharArray();
        // char[] tArray = t.toCharArray();
        // Arrays.sort(sArray);
        // Arrays.sort(tArray);
        // return Arrays.equals(sArray, tArray);

        // 2. Using HashMap
        // Map<Character, Integer> mapS = new HashMap<>();
        // Map<Character, Integer> mapT = new HashMap<>();
        // for(int i=0; i<s.length(); i++){
        //     mapS.put(s.charAt(i), mapS.getOrDefault(s.charAt(i), 0) + 1);
        //     mapT.put(t.charAt(i), mapT.getOrDefault(t.charAt(i), 0) + 1);
        // }
        // return mapS.equals(mapT);   

        // Most Optimal Solution:
        // Follow up: What if the inputs contain Unicode characters? 
        // How would you adapt your solution to such a case?
        int[] count = new int[26];
        for(int i=0; i<s.length(); i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for(int val : count){
            if(val !=0){
                return false;
            }
        }
        return true;
    }
}