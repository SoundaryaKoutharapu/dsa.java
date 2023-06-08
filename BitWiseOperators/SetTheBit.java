// Set the ith bit means - setting the ith bit to 1

public class SetTheBit
{
    public static void main(String[] args) 
    {
        int n = 18;
        System.out.println(setthebit(n));
        System.out.println( resetthebit(n));
    }

    static int setthebit(int n) 
    {
       return n<<2 | 1;  
    }

    static int resetthebit(int n) 
    {
       return n<<2 & 1;  
    }


}