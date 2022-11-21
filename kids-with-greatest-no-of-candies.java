class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> lst=new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            int temp=candies[i]+extraCandies;
            int flag=0;
            for(int j=0;j<candies.length;j++){
                if(temp<candies[j]){
                    flag=1;
                }
            }
            if(flag==1){
                lst.add(false);
            }
            else{
                lst.add(true);
            }
        }
        return lst;
    }
}
