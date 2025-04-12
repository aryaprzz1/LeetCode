public class L344_ReverseString {
    public String reverseString( String  s) {
        char ch []= s.toCharArray() ;

        int sp = 0 ;
        int e = ch.length -1 ;

        while(sp<e){
            char t = ch[sp];
            ch[sp] = ch[e];
            ch[e] =t;
            sp++;
            e--;
        }

        return new String(ch);
        //retunr "".valueOf(ch);
    }
}
