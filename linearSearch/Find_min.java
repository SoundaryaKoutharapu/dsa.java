//  Finding the Mininmum element in an array using linera search

import java.util.Scanner;

public class Find_min 
{                  
   // This is to find Max element

    private static int maximum(int[] arr) 
    {
        if(arr.length==0)
       {
         return Integer.MAX_VALUE;
       }
    else
    {
         int max = arr[0];
         for(int i =0;i<arr.length; i++)
         {
            if(arr[i]>max)
            {
                max = arr[i];
            }
         }
        return max; 
    }     
    }

   // This is to find Min element

    private static int minimum(int[] arr) 
    {
        if(arr.length==0)
       {
         return Integer.MIN_VALUE;
       }
    else
    {
         int min = arr[0];
         for(int i =0;i<arr.length; i++)
         {
            if(arr[i]<min)
            {
                min = arr[i];
            }
         }
        return min; 
    }     
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("enter array elements");
        for (int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
          System.out.println();
          System.out.println("The min element is:"+minimum(arr));
          System.out.println("The max element is:"+maximum(arr));
          sc.close();
    }
}
