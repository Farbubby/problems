public class Binomial
{
    public static void main(String[] args)
    {
        System.out.println(binomialDP(10, 5));
    }

    public static int binomialRecursive(int n, int k)
    {
        if (k == 0 || k == n) 
            return 1;

        if (k > n) 
            return 0;

        return binomialRecursive(n-1, k-1) + binomialRecursive(n-1, k);
    }

    public static int binomialDP(int n, int k)
    {
        if (k > n) return 0;

        int[][] dp = new int[n+1][k+1];

        for (int i = 0; i < n+1; i++)
        {
            dp[i][0] = 1;
        }

        for (int i = 0; i < k+1; i++)
        {
            dp[i][i] = 1;
        }

        for (int i = 2; i < n+1; i++)
        {
            for (int j = 1; j < Math.min(i, k+1); j++)
            {
                dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
            }
        }

        return dp[n][k];
    }
}