class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        for(int i=0;i<heights.length;i++){
            int max=i;
            for(int j=i+1;j<heights.length;j++){
                if(heights[max]<heights[j]){
                    max=j;
                }
            }
            if(max!=i){
                int temp=heights[i];
                heights[i]=heights[max];
                heights[max]=temp;
                
                String temp2=names[i];
                names[i]=names[max];
                names[max]=temp2;
            }
        }
        return names;
    }
}
