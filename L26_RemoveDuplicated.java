

public class L26_RemoveDuplicated {
    // [0,0,1,1,1,2,2,3,3,4]
    public int removeduplicates(int[]nums){
        int u = 1 ;
        for(int j = 1;j<nums.length ; j++){
            if(nums[j]!= nums[j-1]){
                u++;
                nums[u-1] = nums[j];
            }
        }

        return u ;
    }

}
