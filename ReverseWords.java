public class ReverseWords 
{
    static String reverseWords(String str)
    {
        // code here
        String[] arr = str.split("\\.");
        String ans= "";
        for(int i=arr.length-1; i>=0;i--)
        {
            ans=ans + "."+arr[i];
        }
        return ans.substring(1);
    }
    public static void main(String[] args) 
    {
        String str=" i.like.this.program.very.much";
        String res=reverseWords(str);
        System.out.println(res);
    }
}
