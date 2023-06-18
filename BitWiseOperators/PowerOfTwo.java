public class PowerOfTwo
{
    public static void main(String[] args) 
    {
        int n = 256;
        boolean ans  = false;
        int sol = n & (n-1);


        if(sol == 0)
        {
            ans = true;
        }

        System.out.println(ans);
    }
}