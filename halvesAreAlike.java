class Solution {
    public boolean halvesAreAlike(String s) {
        int count1=0,count2=0;
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U' || s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                count1++;
            }
        }
        for(int i=s.length()/2;i<s.length();i++){
            if(s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U' || s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                count2++;
            }
        }
        if(count1==count2)
            return true;
        else
            return false;
    }
}
