import java.util.Arrays;

public class BubbleSort 
{
    public static void main(String[] args) 
    {
        int[] arr = {12,89,03,67,89,34};
          bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr) 
    {
         for(int i=0;i<arr.length;i++)
         {
            for(int j=1;j<arr.length-i;j++)
            {

               /*  descending order
               if(arr[j-1]<arr[j])
               {
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
               }
              */
               if(arr[j]<arr[j-1])
               {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
               }
            }
         }   
    }
}
