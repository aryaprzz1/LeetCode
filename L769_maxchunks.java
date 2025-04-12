public class L769_maxchunks {
    public int maxChunksToSorted(int[] arr) {
        int max = Integer.MIN_VALUE;
        int ans  = 0 ;
        for(int i  =0 ; i< arr.length;i++){
            max = Math.max(max, arr[i]);
            if (max == i) {
                ans++;
                
            }
        }  
        return ans ;
    }
    
}
