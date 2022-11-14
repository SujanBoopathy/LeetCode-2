class Solution {
    public int reverseInteger(int i){
        int rev=0;
        while(i>0){
            rev=(rev*10)+(i%10);
            i/=10;
        }
        return rev;
    }
    public int countDistinctIntegers(int[] nums) {
        List<Integer> result=new ArrayList<>();
        for(int i:nums){
            if(!result.contains(i)){
                result.add(i);
            }
            int temp=reverseInteger(i);
            if(!result.contains(temp)){
                result.add(temp);
            }
        }
        return result.size();
    }
}
