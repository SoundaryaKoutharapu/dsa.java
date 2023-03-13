

public class Search_In_String 
{

    private static String string_search(String s, char target) 
    {
        if(s.length()==0)
        {
            return null;
        }
        else
        {
            for(int i=0;i<s.length();i++)
            {
            if(target==s.charAt(i))
             System.out.println("true");
            }
        }  

        return null;   
    }


    public static void main(String[] args) 
    {
        String s = "Hima Soundarya";
        char target = 'a';
        string_search(s,target);
       // System.out.println(ans);
      

    }
}
    
