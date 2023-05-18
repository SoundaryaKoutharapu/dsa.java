// fibonocci series using recursion

import java.lang.Math;

public class FibinocciSeries
{
    static int fibo(int n)
    {
        if(n<2)
        {
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }

    static double fiboFormula(int n)
    {
        return Math.pow((1+Math.sqrt(5)/2), n) / Math.sqrt(5);
    } 



    public static void main(String[] args) 
    {
      System.out.println( fiboFormula(60));
    }
}