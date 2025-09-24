public class leet2 {
    static int diagSum(int[][] mat){
        int n = mat.length;
        int md = 0;
        int sd = 0;
        for (int i = 0; i < n; i++) {
            md += mat[i][i];
            sd += mat[i][n - 1 - i];
        }
        if (n%2==1){
            return md + sd - mat[n/2][n/2];
        }
        return md + sd;
    }
}
