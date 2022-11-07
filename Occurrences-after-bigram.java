class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String[] str=text.split(" ");
        int count=0,k=0;
        for(int i=0;i<str.length;i++){
            if(i+2<str.length && first.equals(str[i]) && second.equals(str[i+1])){
                count++;
            }
        }
        String[] result=new String[count];
        for(int i=0;i<str.length;i++){
            if(i+2<str.length && first.equals(str[i]) && second.equals(str[i+1])){                
                    result[k]=str[i+2];
                    k++;           
            }
        }
        return result;
        

        

   
    }
}
