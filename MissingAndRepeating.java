
import java.util.*;
public class MissingAndRepeating 
{
    public static int [] FindtwoElement(int arr[])
    {
        int n=arr.length;  //Size of the Array
        int nums[]=new int [n+1]; //new Arrays name is nums

        //Update the nums Arrays
        for(int i=0; i<n; i++)
        {
            nums[arr[i]]++;
        }
        //finding the repeating and missing number
        int repeating=-1;
        int missing=-1;
        for(int i=1; i<=n; i++)
        {
            if(nums[i]==2)
            {
                repeating=i;
            }
            else if(nums[i]==0)
            {
                missing=i;
            }
            if(repeating != -1 && missing != -1)
            {
                break;
            }
        }
         int ans[]={repeating,missing};
         return ans;
    }
  public static void main(String[] args) 
  {
    int arr[]={1,3,3};
    int ans[]=FindtwoElement(arr);
    System.out.println("The repating ans Missing number are :{"+ans[0]+","+ans[1]+"}");

  }  
}
