import java.util.Arrays;

public class BubbleSort 
{
    public static void main(String[] args) 
    {
        int[] arr = {1,2,3,4,5};
          bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr) 
    {
        boolean swapped;
         for(int i=0;i<arr.length;i++)
         {
            swapped = false;   
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
               swapped = true;
            }
 // if you did not swap for a particular value of i , then it means the program is swapped so you can stop the program     
        if(!swapped)
         {
            break;
         }

         }  
         
    }
}
