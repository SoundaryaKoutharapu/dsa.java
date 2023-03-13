
import java.util.Scanner;

public class LinearSearch 
{

    private int linear_search(int[] arr,int target)
    {
    
    // This is using normal for loop

           /*  
               if(arr.length==0)

                 {
                    return -1;
                 }
            
                 for(int i =0; i<arr.length;i++)
                    {
                        if(arr[i]==target)
                        {
                             return i;
                        }
                    }
           */ 
            
  //  This is using enhanced for loop

      if(arr.length==0)
      {
        return -1;
      }

      for(int element: arr)
      {
            if(element==target)
            return element;
      }

        return Integer.MAX_VALUE; 
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

        System.out.println("enter target element");
        int target = sc.nextInt();
        
        LinearSearch l = new LinearSearch();
        System.out.println(l.linear_search(arr,target));
        sc.close();
     }

}
