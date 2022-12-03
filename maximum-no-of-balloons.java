class Solution {
    public int maxNumberOfBalloons(String text) {
        int count[]=new int[26];
        for(int i=0;i<text.length();i++){
            count[text.charAt(i)-'a']++;
        }
        int result=Math.min(count[1],count[0]);
        result=Math.min(result,count[11]/2);
        result=Math.min(result,count[13]);
        result=Math.min(result,count[14]/2);
        return result;
    }
}
