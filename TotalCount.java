
public class TotalCount
{
    public static int totalCount(int k, int [] arr)
    {
        int count=0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] % k==0)
            {
                count +=arr[i]/k;
            }
            else
            {
                count +=arr[i]/k+1;
            }
        }
        return count;
    }
  public static void main(String[] args)
  {
    int k=3;
    int arr[]={5, 8, 10, 13};
    int result=totalCount(k, arr);
    System.out.println(result);
    
  }    
}
