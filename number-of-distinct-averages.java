class Solution {
    public int distinctAverages(int[] nums) {
        Set<Integer> set=new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length/2;i++){
            set.add(nums[i]+nums[nums.length-i-1]);
        }
        return set.size();
        
    }
}
