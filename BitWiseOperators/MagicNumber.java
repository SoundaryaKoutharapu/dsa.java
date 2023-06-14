public class MagicNumber
{
     public static void main(String[] args) 
     {
        int n = 1;
        int ans = 0;
        int base = 5;
        int counter = 0;
        while(n>0)
        {
            int lastDigit = n&1;
            n = n>>1;
            ans  += (lastDigit * base);
            base = base*5;
            counter++;
        }

        System.out.println(ans);
        System.out.println(counter);       
     }
      
    }
