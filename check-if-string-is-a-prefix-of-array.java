class Solution {
    public boolean isPrefixString(String s, String[] words) {
        String str="";
        for(String i : words){
            if(str.length()+i.length() <= s.length()){
                str+=i;
            }
        }
        System.out.println(str);
        if(s.length()!=str.length())
            return false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=str.charAt(i)){
                return false;
            }
        }
        return true;
    }
}
