class Solution {
    public int maximum69Number (int num) {
        String s=Integer.toString(num);
        String result="";
        int flag=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='6' && flag==0){
                result+='9';
                flag=1;
            }
            else{
                result+=s.charAt(i);
            }
        }
        return Integer.parseInt(result);
    }
}
