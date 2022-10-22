class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int count[]=new int[26];
        int count2[]=new int[26];
        int dif=0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                if(dif==2){
                    return false;
                }
                dif++;
                count[s1.charAt(i)-'a']++;
                count2[s2.charAt(i)-'a']++;
            }
        }
        for(int i=0;i<26;i++){
            if(count[i]!=count2[i]){
                return false;
            }
        }
        return true;
    }
}
