public class L709_toLowerCase {
    public String tolowerCase(String s){

        char ch []= s.toCharArray();

        for(int i = 0 ; i< ch.length ; i++){
            if(ch[i]>= 65 && ch[i] <=90){
                ch[i] = (char)(ch[i] + 32) ;
            }
        }

        return new String(ch);

        // return "".valueOf(ch);

    }
}
