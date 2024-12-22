

public class L917_RevLetters {
    public String reverseOnlyLetters(String s){
        
        int  i = 0 ;
        int j = s.length() - 1;
        char[] arr = s.toCharArray();

        while(i < j){
            if(isValid(arr[i])){
                while(!isValid(arr[j])){
                    j--;
                }
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] =  temp ;
                j-- ;
                
            }
            i++ ;
        }
        return new String(arr);    
    }
    public Boolean isValid(char c){
        return(65<= c && 90 >= c || 97 <= c && c<=122 );
    }
}
