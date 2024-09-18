import java.util.*;
public class ParenthesisChecker 
{
    static boolean ispar(String x)
    {
        Stack<Character> st=new Stack<>();

        for(int i=0; i<x.length(); i++)
        {
            char ch=x.charAt(i);
            if(st.isEmpty())
            {
                st.push(ch);
            }
            else if((st.peek() == '(' && ch == ')')||
                    (st.peek() == '{' && ch == '}')||
                    (st.peek() == '[' && ch == ']'))
                    {
                        st.pop();

                    }
                    else
                    {
                        st.push(ch);
                    }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) 
    {
        String x="{([])}";
        
        if(ispar(x))
        {
            System.out.println("Balanced");
        }
        else{
            System.out.println("UnBalanced");
        }
    }
    
}
