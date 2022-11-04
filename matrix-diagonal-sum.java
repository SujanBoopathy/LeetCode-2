class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(i==j){
                    sum+=mat[i][j];
                }
                if(mat[i].length-i-1 == j){
                    if(i!=j)
                       sum+=mat[i][j];
                }
            }
        }
        return sum;
    }
}