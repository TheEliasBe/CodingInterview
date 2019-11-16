public class Exercise1_5 {

    // compress a string by using counts of repeated characters

    public static void main(String[] args) {
        System.out.println(compress("aaabbcc")); //a3b2c2
    }

    static String compress(String s){
        char[] charArray = s.toCharArray();
        char prev = charArray[0];
        int counter = 0;
        StringBuilder res = new StringBuilder();

        for(char c : charArray){
            if(prev == c){
                counter++;
            }else{
                res.append(prev);
                res.append(counter);
                counter = 1;
            }
            prev = c;
        }
        res.append(prev);
        res.append(counter);
        return res.toString();
    }
}
