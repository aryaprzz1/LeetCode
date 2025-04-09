public class L922_SortAraayByparity2 {
    
    public int[] L922_SortArrayByparityII(int [] nums){

     
        int n = nums.length ;
        int even = 0;
        int odd = 1 ;

        int result [] = new int[n];

        for(int num : nums){
            if(num % 2 == 0){
                result[even] = num ;
                even += 2 ;
            }
            if(num % 2 != 0 ){
                result[odd] = num ;
                odd += 2 ;
            }
        }
        return result ;

    }
}
