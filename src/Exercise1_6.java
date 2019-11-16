import java.util.Arrays;

public class Exercise1_6 {

    // rotate a matrix by 90 degrees clockwise inplace

    public static void main(String[] args) {
        int[][] m = {{1,2},{3,4}};
        System.out.println(Arrays.deepToString(rotate(m)));
    }

    static int[][] rotate(int[][] m){
        if(m.length != m[0].length){
            throw new IllegalArgumentException("Not a square matrix");
        }
        int n = m.length;

        //traverse matrix in rings
        for(int i = 0; i < n/2; i++){
            for(int j = i; i < n-i-1; i++){
                int temp = m[i][j];
                // moves values
                m[i][j] = m[j][n-1-i];
                m[j][n-1-i] = m[j][n-1-j];
                m[j][n-1-i] = m[n-1-i][n-1-j];
                m[n-1-i][n-1-j] = m[n-1-i][j];
                m[n-1-j][i] = temp;
            }
        }
        return m;
    }
}
