import java.util.Arrays;

public class SelectionSort 
{    
    public static void main(String[] args) 
    {
        int[] arr = {4,7,0,1,4,9,23};
         selection(arr);
         System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr)
    {
        for(int i =0; i<arr.length; i++)
        {
            int last  = arr.length-1-i;
           int maxIndex =  getMaxIndex(arr,0,last);
           swap(arr,maxIndex,last);
        }
    }


    static void swap(int[] arr, int maxIndex, int last) 
    {
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[last];
        arr[last]  = temp;
    }


    static int getMaxIndex(int[] arr, int start,int last) 
   {
    int max = 0;
    for(int i =0; i<=last; i++)
    {
       if(arr[i]>arr[max])
       {
        max = i;
       }
    }
   return max;
 }
}   

       