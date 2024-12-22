public class L1512_GoodPairs {
 public int identicalTwin(int [] nums){
    int res = 0 ;
    int count[] = new int [101];

    for(int i = 0 ; i < nums.length; i++){
        count[i]++;
    }
    for (int n : count) {
        n = (n * (n-1))/2 ;
        res += n ;
    }
    return res ;
 }
}
