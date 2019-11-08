import java.util.Arrays;

public class Exercise1_3 {

    // Given two strings, write a method to decide if one is a permutation of the other

    public static void main(String[] args) {
        System.out.println(isPermutation("abc","cba")); // true
        System.out.println(isPermutation("Aa","aA")); // true
        System.out.println(isPermutation("aab","abc")); // false
        System.out.println(isPermutation("AA","aa")); //false
    }
    static private boolean isPermutation(String s1, String s2){
        char[] c1 = s1.toCharArray();
        Arrays.sort(c1);
        char[] c2 = s2.toCharArray();
        Arrays.sort(c2);

        return Arrays.equals(c1,c2);
    }
}
