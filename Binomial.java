public class Binomial
{
    public static void main(String[] args)
    {
        System.out.println(binomialRecursive(10, 5));
    }

    public static int binomialRecursive(int n, int k)
    {
        if (k == 0 || k == n) 
            return 1;

        if (k > n) 
            return 0;

        return binomialRecursive(n-1, k-1) + binomialRecursive(n-1, k);
    }
}