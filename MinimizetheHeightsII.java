import java.util.Arrays;

public class MinimizetheHeightsII 
{
    static int getMinDiff(int arr[], int k)
    {
        int n=arr.length;
        int max=Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;

        Arrays.sort(arr);
        int result=arr[n-1] - arr[0];
        for(int i=0; i<n; i++)
        {
            if(arr[i] > k)
            {
                max=Math.max(arr[i-1] + k , arr[n-1] - k);
                min=Math.min(arr[0] + k, arr[i] - k);
                result=Math.min(result, max-min);
            }
            else
            {
                continue;
            }
        }
        return result;
    }
        public static void main(String[] args) 
        {
          int arr1[]={1, 5, 8, 10};
          int k1=2;
          int result1=getMinDiff(arr1, k1);
          System.out.println(result1);

        }
    
}
