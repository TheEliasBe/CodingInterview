public class Exercise1_8 {
    // check is a string is a rotation of another string using only 1 call to isSubtring()
    // eg waterbottle is a rotation of erbottlewat

    public static void main(String[] args) {
        System.out.println(isRotation("erbottlewat", "waterbottle"));
        System.out.println(isRotation("ilase", "elias"));
    }


    // s1 is rotated string
    private static boolean isRotation(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        // concate s1 to itself
        s1 += s1;

        if(s1.contains(s2)){
            return true;
        }else{
            return false;
        }
    }
}
