import java.util.Arrays;

// https://leetcode.com/problems/set-mismatch/

public class SetMismatch 
{
    public static void main(String[] args) 
    {
      // int[] arr = {4,3,2,5,6,3,1};
       int[] arr = {3,2,2};
        int ans[] = cyclesort(arr);
        System.out.println(Arrays.toString(ans));
    }

   public static int[] cyclesort(int[] arr)
   {
        int i=0;
        while(i<arr.length)
        {
            int correctIndex =arr[i]-1;
            if(arr[i]!=arr[correctIndex])
            {
                int temp =arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }
            else
            {
                i++;
            }     
        }

        for(int j=0; j<arr.length; j++)
        {
            if(arr[j]!=j+1)
            {
              return new int[] {arr[j], j+1};
            }
        }
        return new int[] {-1, -1};
   }
  
}
