class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1="",str2="";
        for(String i: word1){
            str1+=i;
        }
        for(String i: word2){
            str2+=i;
        }
        if(str1.equals(str2)){
            return true;
        }
        else{
            return false;
        }
    }
}
