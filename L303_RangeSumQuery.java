

public class L303_RangeSumQuery {
    private int [] pfs;
    public  L303_RangeSumQuery(int[] nums){
        
        pfs = new int[nums.length];
        pfs[0]= nums[0];
        for(int i = 1 ; i < nums.length ; i++){
            pfs[i] = pfs[i-1] + nums[i];
        }

    }

    public int sumRange(int left , int right){
      
            if(left == 0 ){
                return pfs[right];
            }else{
                return pfs[right] - pfs[left -1];
            }

    }
}
