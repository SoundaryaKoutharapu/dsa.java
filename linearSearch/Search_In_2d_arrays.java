

// import java.util.Arrays;

public class Search_In_2d_arrays 
{
/*    
static int[] search_in_2d(int[][] arr, int target)
{
  for(int row =0; row<arr.length; row++)
  {
    for(int col =0; col<=row;col++)
    {
        if(arr[row][col]==target)
        {
            return new int[]{row,col};
        }
    }
  }  
  
    return new int[]{-1 -1};
}
*/

    
static int search_in_max(int[][] arr)
{
   int max = Integer.MIN_VALUE;

   for(int row =0; row<arr.length; row++)
  {
    for(int col =0; col<= arr[row].length;col++)
    {
        if(arr[row][col]>max)
        {
            max = arr[row][col];  
        }
    }
 }  
  return max;
}



public static void main(String[] args)
{
    int[][] arr = {
                     {1,-1,9,0},
                    {56,90,12,6},
                    {34,78,123, 56},
                    {34,98,0,0}

                  };

      //int target = 98;
     //int [] ans = search_in_2d(arr,target);
    // System.out.println(Arrays.toString(ans));
    System.out.println(search_in_max(arr));
    
}
}


