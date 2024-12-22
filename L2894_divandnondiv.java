

class L2894_divandnondiv{
    public int diff(int n , int m){
        // int num1 = 0;// not divisble by m
        // int num2 = 0 ; // divisible by m 
        
        // for(int i = 1 ; i <= n ; i++){
        //     if( i % m == 0){ // 1,2,3,4,5,6,7 % 3
        //         num2 = num2 + i ;

        //     }else{
        //         num1 = num1 + i ;
        //     }
        // }
        // return num1 - num2;
        
        int x  = n / m ;
        int n2 = m * x * (x+1)/2 ;
        int n1  = n*(n+1)/2 - n2;
        return n1 - n2 ;



        
    }
}