import java.util.Arrays;

public class CyclicSort 
{
   public static void main(String[] args) {
        int [] arr = {3,7,2,1,6,5,4,8};
      // int[] arr = {3,5,1,2,4};
         sort(arr);
         System.out.println(Arrays.toString(arr));
     }

    static void sort(int[] arr)
     {
       int i =0;     
       while(i<arr.length)
       {      
         int correctIndex = arr[i]-1;
         if(arr[i]!=arr[correctIndex])
          {
            int temp = arr[correctIndex];
            arr[correctIndex] = arr[i];
            arr[i] = temp;
          }
             else
                i++;
        }
    }
}
