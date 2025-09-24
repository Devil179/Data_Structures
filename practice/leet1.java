public class leet1 {
    static int maxWealth(int[][] accounts){
        int maxWealth = 0;
        for (int i = 0; i < accounts.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                rowSum += accounts[i][j];
            }
            if (rowSum > maxWealth) {
                maxWealth = rowSum;
            }
        }
        return maxWealth;
    }

    public static void main(String[] args) {
        int[][] accounts = {{1,2,3}, {3,2,1}};
        int result = maxWealth(accounts);
        System.out.println(result); // expected 6
    }
}
