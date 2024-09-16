import java.util.*;
public class LongestValidParentheses 
{
    static int maxLength(String S)
    {
        // code here
        Stack<Integer>st=new Stack<>();
        st.push(-1);    //-1 handle a edges cases
        
        int maxLength=0;    //store the maximum length of valid parentheses
        for(int i=0; i<S.length();i++)
        {
            if(S.charAt(i) == '(')
            {
                st.push(i);
            }
            else
            {
                st.pop();
                if(!st.isEmpty())
                {
                    maxLength=Math.max(maxLength, i-st.peek());
                }
                else
                {
                    st.push(i);
                }
            }
        }
        return maxLength;
    }
    public static void main(String [] args)
    {
        String s = ")()())";
        System.out.println(maxLength(s));
    }
}
