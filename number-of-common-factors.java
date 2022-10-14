class Solution {
    public int findFactor(int a,int b){
        int count=0;
        for(int i=1;i<=a/2;i++){
            if(a%i==0 && b%i==0){
                count++;
            }
        }
        return count;
    }
    public int commonFactors(int a, int b) {
        if(a>b){
            return findFactor(a,b);
        }
        else if(b>a){
            return findFactor(b,a);
        }
        else{
            return findFactor(a,b)+1;
        }
    }
}
