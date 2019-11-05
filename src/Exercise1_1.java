public class Exercise1_1 {

    // Implement an algorithm to determine if a string has all unique characters

    public static void main(String[] args) {
        System.out.println(checkAllUniqueChars("abcde")); // true
        System.out.println(checkAllUniqueChars("abcdeabcde")); //false
        System.out.println(checkAllUniqueChars("aA")); // true
    }

    static public boolean checkAllUniqueChars(String s){
        char[] c_array = s.toCharArray();
        boolean[] unique_char = new boolean[128];

        for(char c : c_array){
            if(unique_char[(int)c]){
                return false;
            }else{
                unique_char[(int)c] = true;
            }
        }
        return true;
    }
}
