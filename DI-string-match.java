class Solution {
    public int[] diStringMatch(String s) {
        int[] res = new int[s.length() + 1];
        int end = res.length - 1, start = 0;
        int index = 0;
        while(index < s.length()){
            if(s.charAt(index) == 'I'){
                res[index] = start;   
                start++;
            }else{
                res[index] = end;
                end--;
            }
            index++;
        }
        res[res.length - 1] = start;//start or end all is true
        return res;
    }
}
