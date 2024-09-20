public class FacingtheSun 
{
    public static int countBuildings(int[] height) 
    {
        int count=1;
        int max_height=height[0];

        for(int i=1; i<height.length; i++)
        {
            if(height[i] > max_height)
            {
                count++;
                max_height=height[i];
            }
        }
        return count;
    }
    public static void main(String[] args)
    {
        int height[]={7,4,8,2,9};
        int result=countBuildings(height);
        System.out.println(result);
    }
}
