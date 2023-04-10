import java.util.Arrays;

public class InsertionSort
{
     public static void main(String[] args)
     {
         int[] arr = {34,67,9,12,0,4,78};
         insert(arr);
         System.out.println(Arrays.toString(arr));
     }

    static int[] insert(int[] arr)
     {
         for(int i=0; i<arr.length-1; i++)
         {
            for(int j=i+1; j>0; j--)
            {
                if(arr[j]<arr[j-1])
                {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
                else
                     break;
            }
         }   

        return arr;
     }
}