class Solution {
    public int largestAltitude(int[] gain) {
        int maxAltitude=0,altitude=0;
        for(int i=0;i<gain.length;i++){
            altitude+=gain[i];
            if(maxAltitude<altitude){
                maxAltitude=altitude;
            }
        }
        return maxAltitude;
    }
}
