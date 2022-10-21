class Solution {
    public int maxRepeating(String sequence, String word) {
        int maximum = 0;
        for(int i=0; i<sequence.length(); i++) {
            int count = 0;
            int k = 0;
            for(int j=i; j<sequence.length(); j++) {
                if(sequence.charAt(j) == word.charAt(k)){
                    k++;
                }
                else{
                    break;
                }
                if(k == word.length()) {
                    k = 0;
                    count++;
                }
            }
            maximum = Math.max(maximum, count);
        }
        return maximum;
    }
}
