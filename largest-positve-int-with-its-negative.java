class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        for(int i=nums.length-1;i>=0;i--){
            for(int j=0;j<nums.length;j++){
                if(nums[j]<0){
                    if((-1*nums[j])==nums[i]){
                        return nums[i];
                    }
                }
                else{
                    break;
                }
            }
        }
        return -1;
    }
}
