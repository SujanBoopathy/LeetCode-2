class Solution {
    public int  reverseInteger(int i){
        int rev=0;
        while(i>0){
            rev=(rev*10)+(i%10);
            i/=10;
        }
        return rev;
    }
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        for(int i:nums){
            set.add(reverseInteger(i));
        }
        return set.size();
    }
}
