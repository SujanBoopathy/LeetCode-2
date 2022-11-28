class Solution {
    public int distinctAverages(int[] nums) {
        Set<Float> set=new HashSet<>();
        for(int k=0;k<nums.length/2;k++){
            int min=-1,max=-1;
            int minValue=101,maxValue=-1;
            for(int i=0;i<nums.length;i++){
                if(nums[i]!=-1){
                    if(minValue>nums[i]){
                        min=i;
                        minValue=nums[i];
                    }
                    if(maxValue<nums[i]){
                        max=i;
                        maxValue=nums[i];
                    }
                }
            }
            float x=(minValue+maxValue)/2;
            set.add(x);
            nums[min]=-1;
            nums[max]=-1;

        }
        return set.size();
    }
}
