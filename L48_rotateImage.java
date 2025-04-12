public class L48_rotateImage {
    public void rotate(int[][] matrix) {
        transpose(matrix);

        for(int i = 0 ; i< matrix.length ; i++){
           int []t =  matrix[i];
           reverse(t);
        }
        
    }

    public void transpose(int [][] arr){
        int m = arr.length ;
        int n = arr[0].length;

        for(int i = 1 ; i< m ; i++){
            for(int j = 0 ; j < i ; j++){
                int t  = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i]= t ; 
            }
        }
    }
    public void  reverse(int ar[]){
        int s = 0 ;
        int e = ar.length -1 ;

        while(s<e){
            int t = ar[s];
            ar[s] = ar[e];
            ar[e] = t ;
            s++;
            e--;
        }
    }
}
