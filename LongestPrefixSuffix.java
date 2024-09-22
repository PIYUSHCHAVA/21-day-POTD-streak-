//Using KMP Algorithm(KMP (Knuth Morris Pratt) Pattern Searching)*
public class LongestPrefixSuffix 
{
     static int lps(String str)
    {
      int n=str.length();
      int arr[]=new int[n];
      int j=0;
      for(int i=0; i<n;)
      {
        if(str.charAt(i) == str.charAt(j))
        {
          arr[i]=j+1;
          j++;
          i++;
        }
        else{
            if(j==0)
            {
                i++;
            }
            else{
                j=arr[j-1];
            }
        }
      }
      return arr[n-1];
    }
    public static void main(String[] args)
    {
        String str="abab";
        System.out.println(lps(str));
    }
    
}
