class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length ==1){
            return false;
        }
        // 1. Brute Force
        // for(int i=0; i<nums.length; i++){
        //     for(int j=i+1; j<nums.length; j++){
        //         if(nums[i] == nums[j]){
        //             return true;
        //         }
        //     }
        // }
        // return false;

        //2. Optimal Solution using HashSet
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(set.contains(nums[i])){
                return true;
            } 
            set.add(nums[i]);
        }
        return false;        
    }
}