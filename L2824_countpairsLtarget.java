

import java.util.List;

public class L2824_countpairsLtarget {
    public int countpairs(List<Integer> nums , int target){
        int res = 0;
        for(int i = 1 ; i< nums.size() ; i++){
            for(int j = 0 ; j<i ; j++){
                if(nums.get(i)+ nums.get(j)< target){
                    res++;
                }
            }
        }
        return res ;
    }
    
}

// public int countpairs(List<Integer> nums , int target){
//     int res = 0;
        // int l = 0;
        // nums.sort((a,b) -> (a-b));
        // int r =  nums.size() -1;

        // while(l != r){
        //     if(nums.get(l) + nums.get(r)< target){
        //         res = res + r - l ; 
        //         l++ ;
        //     }else{
        //         r-- ;
        //     }

        // }
//     return res ;
// }
