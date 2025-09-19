public class prac10 {
    static int[][] sum_mat(int[][] mat){
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                sum += mat[i][j];
            }

        }
        System.out.println("Sum = " + sum);
        return mat;
    }
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
    static int[][] max_mat(int[][] mat){
        int max_ele = mat[0][0];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if(mat[i][j] > max_ele)
                {
                    max_ele = mat[i][j];
                }
            }

        }
        System.out.println("Max = " + max_ele);
        return mat;
    }
    
    static int[][] min_mat(int[][] mat) {
        int min_ele = mat[0][0];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] < min_ele) {
                    min_ele = mat[i][j];
                }
            }

        }
        System.out.println("Min = " +   min_ele);
        return mat;
    }
    public static void main(String[] args) {
        int[][] mat = {
                { 1, 3, 5 },
                { 4, 2, 7 }
        };
        sum_mat(mat);
        count_evens(mat);
        max_mat(mat);
        min_mat(mat);

    }
}
