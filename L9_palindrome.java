

public class L9_palindrome {
    public boolean isPalindrome(int x){

        if(x<0){
            return false;
        }
    
        int ex = x; //101
        int pal = 0;
        int mod = 0;

        while (ex != 0) {
            mod = ex % 10;
            pal = pal *10 + mod;
            ex = ex/10;  
        }

        return x== pal;
        
    }
}
