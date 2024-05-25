package question1;

public class Main {
    public static void main(String[] args) {
        // int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }; // intput 1
        int[][] matrix = {{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}}; // intput 2

        int l = 0, r = matrix[0].length - 1, res = 0;

        for (int i = 0; i < matrix.length; i++) {
            int lResult = matrix[i][l];
            int rResult = matrix[i][r];

            res += lResult + rResult;
            if (l == r) {
                res -= lResult;
            }

            l++;
            r--;
        }

        System.out.println(res);
    }
}