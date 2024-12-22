

public class L977_SqaresSorted {
    public int [] sortedSquares(int[] nums){

        int l = 0 ;
        int r = nums.length -1 ;
        int res [] = new int [nums.length];


        for(int i = nums.length -1 ; i >=0; i--){
            if( Math.abs(r) >= Math.abs(l) ){
                res [i]= nums[r] * nums[r];

            }else if(Math.abs(r) < Math.abs(l)){
                res[i] = nums[l] * nums[l];
                l++;
            }
        }
        return res ;

        // while(r>= l){
        //     if( Math.abs(r) > Math.abs(l) ){


        //     }

        // }

    }
}
