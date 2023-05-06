// Binary Search using recursion

public class BSRecursion
{
    public static void main(String[] args) 
    {
         int[] arr = {11,56,89,90,112,345};
       int ans =   search(arr, 0, 6, 89);
       System.out.println(ans);
    }

    static int search(int[] arr, int s, int e, int target) 
    {
        if(s>e)
        {
            return -1;
        }
    int m = s+(e-s)/2;

     if(arr[m] == target)
     {
        return m;
     }
        if(arr[m] >target)
        {
           return search(arr, s, m-1, target);
        }
        else
        {
          return search(arr, m+1, e, target);
        }
    }
}