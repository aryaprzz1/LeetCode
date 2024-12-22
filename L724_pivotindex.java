

public class L724_pivotindex {
    public int pivotIndex(int[] nums) {

        int pf [] = new int[nums.length];
        pf[0]= nums[0];

        for(int i = 1 ; i < nums.length ; i++){
            pf[i]= pf[i-1] + nums[i];
        }

        int e = pf.length;

        if( 0 == pf[e -1] -pf[0]){
            return 0;
        }

        for (int i = 1; i < e - 1; i++) {
            int ls = pf[i-1] ;
            int rs = pf[e -1] - pf[i];

            if(ls == rs ){
                
                return i;
            }  
        }
       
        if(pf[e-2]== 0){
            return e-1;
        }
        return -1;
    }
}
