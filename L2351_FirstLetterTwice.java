
import java.util.HashSet;
import java.util.Set;

public class L2351_FirstLetterTwice {
    public char repeatedCharacter(String s){
        Set <Character> hs  =  new HashSet<>();
        for(int i = 0 ; i < s.length(); i++){
            if(hs.contains(s.charAt(i))){
                return s.charAt(i);
                
            }else{
                hs.add(s.charAt(i));
            }
        }
        return 'a' ;
    }
}
