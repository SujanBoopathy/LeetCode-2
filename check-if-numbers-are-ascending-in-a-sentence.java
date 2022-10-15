class Solution {
    public boolean areNumbersAscending(String s) {
        String temp="";
        int flag=0;
        int prev=-1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                if(flag==1){
                    if(prev==-1){
                        prev=Integer.parseInt(temp);
                    }
                    else if(prev>=Integer.parseInt(temp)){
                        return false;
                    }
                    else{
                        prev=Integer.parseInt(temp);
                    }
                }
                flag=0;
                temp="";
            }
            else{
                if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                    flag=1;
                }
                temp+=s.charAt(i);
            }
        }
        if(flag==1){
            if(prev>=Integer.parseInt(temp))
                return false;
        }
        return true;
    }
}
