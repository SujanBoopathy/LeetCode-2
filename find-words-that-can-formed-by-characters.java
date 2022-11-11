class Solution {
    public int countCharacters(String[] words, String chars) {
         int[] count = new int[26];
        int res = 0;
        
        for (char ch : chars.toCharArray()) {
            count[ch - 'a']++;
        }
        
        for (String word : words) {
            int[] temp = count.clone();
            boolean match = true;
            
            for (char ch : word.toCharArray()) {
                if (--temp[ch - 'a'] < 0) {
                    match = false;
                    break;
                }
            }
            
            if (match) {
                res += word.length();
            }
        }
        
        return res;
    }
}
