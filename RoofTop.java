public class RoofTop 
{
    public static int maxStep(int arr[])
    {
        int n=arr.length;       ///find the length of the Array
        int maximumStep=0;
        int count=0;

        for(int i=1; i<n; i++)
        {
            if(arr[i] > arr[i-1])
            {
                count++;
            }
            else
            {
                maximumStep=Math.max(maximumStep, count);
                count=0;
            }
        }
        return Math.max(maximumStep,count);
    }
    public static void main(String[] args) 
    {
        int arr[]={1,2,2,3,2};
        int result=maxStep(arr);
        System.out.println(result);
    }    
}
