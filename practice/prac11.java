public class prac11 {
    static int[][] count_evens(int[][] mat) {
        int count = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] % 2 == 0) {
                    count += 1;
                }
            }
        }
        System.out.println("Total even = " + count);
        return mat;
    }
    public static void main(String[] args) {
        int[][] mat = {
                { 1, 3, 5 },
                { 4, 2, 7 }
        };
        count_evens(mat);
    }

}
