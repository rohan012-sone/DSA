class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set <Integer> dup = new HashSet<>();
      
        for(int num : nums){
        
        dup.add(num);
        }
        return dup.size() != nums.length;
    }
}