import java.util.Arrays;

public class BinarySearchIn2D
{

    static int[] search(int[][] arr, int target) 
    {
        int row = 0;
        int col = arr.length-1;
     while(row<arr.length && col>=0)
     {
        if(arr[row][col]==target)
        {
            return new int[]{row,col};
        }
     if(arr[row][col]>target)
        {
            col--;
        }
        else 
        {
            row++;
        }
    }
        return new int[]{-1,-1};
    }



    public static void main(String[] args) 
    {
        int[][] arr = { {10,20,30,40},
                        {11,25,35,45},
                        {28,37,49,51},
                        {42,57,61,72}
                      };
        int target = 72;   
        //int[] ans =  search(arr, target);
       // System.out.println(ans.toString());    
       System.out.println(Arrays.toString(search(arr, target)));
    }

}