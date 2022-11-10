class Solution {
    public int findNumbers(int[] nums) {
        int evenDigits=0;
        for(int i=0;i<nums.length;i++){
            int temp=nums[i],count=0;
            while(temp>0){
                temp/=10;
                count++;
            }
            if(count%2==0){
                evenDigits++;
            }
        }
        return evenDigits;
    }
}
