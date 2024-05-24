public class Main {

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int l = 0, r = matrix[0].length - 1, res = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                int lResult = matrix[i][l];
                int rResult = matrix[i][r];
                if (l == r) {
                    res += lResult;
                    break;
                }
                System.out.println(lResult);
                System.out.println(rResult);
                res += lResult + rResult;
                break;
            }
            l++;
            r--;
        }

        System.out.println(res);
    }
}
