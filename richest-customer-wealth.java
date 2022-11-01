class Solution {
    public int maximumWealth(int[][] accounts) {
        int wealth[]=new int[100];
        for(int i=0;i<accounts.length;i++){
            for(int j=0;j<accounts[i].length;j++){
                wealth[i]+=accounts[i][j];
            }
        }
        int maxWealth=Integer.MIN_VALUE;
        for(int i=0;i<100;i++){
            if(maxWealth<wealth[i]){
                maxWealth=wealth[i];
            }
        }
        return maxWealth;
    }
}
