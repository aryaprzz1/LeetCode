public class L2559_vowelquery {

    private boolean isVowel(char c){
        return c == 'a' || c == 'e' ||c == 'i' ||c == 'o' ||c == 'u';
    }


    public int [] vowelStrings (String words [],int [][] queries){
        int n = words.length;
        int pf []  = new int [n+1];

        for(int i = 0; i <n ; i++ ){
            char start = words[i].charAt(0);
            char end  = words[i].charAt(words[i].length()-1);

            if(isVowel(start) && isVowel(end)){
                pf[i+1] = i + pf[i];
            }else{
                pf[i+1] = pf[i];
            }
        }

        int ans[] = new int [queries.length];
        for(int i = 0 ; i <queries.length ; i++){
            int l = queries[i][0];
            int r = queries[i][1];
            ans[i] = pf[r +1] - pf[l];
        }

        return ans ;
    }
}
