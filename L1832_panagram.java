import java.util.HashSet;
import java.util.Set;

public class L1832_panagram {
    public boolean checkIfPanagram(String sentence){
        Set <Character> hs = new HashSet<>();
        for(int i = 0 ; i < sentence.length(); i++){
            hs.add( sentence.charAt(i));
        }

        // boolean arr [] = new boolean[26];
        // for (int i = 0; i < arr.length; i++) {
        //     arr[sentence.charAt(i) - 'a'] = true ;
        // }
        // for(boolean curr:arr){
        //     if(!curr){
        //         return false;
        //     }
        // }
        
        return hs.size()==26;
    }
}
