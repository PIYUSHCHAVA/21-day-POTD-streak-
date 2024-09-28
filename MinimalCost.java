
public class MinimalCost 
{
    public int minimizeCost(int k, int arr[]) 
    {
        // code here
        int[] dp=new int[arr.length];
        for(int i=arr.length-2; i>=0; i--)
        {
            int mini=Integer.MAX_VALUE;
            for(int j=1; j<=k; j++)
            {
                if(i+j < arr.length)
                {
                    int x=dp[i+j];
                    x +=Math.abs(arr[i] - arr[i+j]);
                    mini=Math.min(mini, x);
                }
            }
            dp[i]=mini;
        }
        return dp[0];
    }
    public static void main(String[] args) 
    {
        MinimalCost mc=new MinimalCost();
        int k = 3;
        int arr[]={10, 30, 40, 50, 20};
        int result= mc.minimizeCost(k,arr);
        System.out.println(result);
    }
}
