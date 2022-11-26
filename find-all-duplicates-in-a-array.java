class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> lst=new ArrayList<>();
        Set<Integer> set=new HashSet<>();
        for(int i:nums){
            if(set.contains(i)){
                lst.add(i);
            }
            set.add(i);
        }
        return lst;
    }
}
