import java.util.ArrayList;
import java.util.List;

public class AllTheMissingNum
{
    public static void main(String[] args) 
    {
       // int[] arr = {4,3,2,7,8,2,3,1};
       int[] arr = {1,4,6,3,7,4,5};
        System.out.println( cyclesort(arr));
    }

   public static List<Integer> cyclesort(int[] arr)
   {
        int i=1;
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

        List<Integer> ans = new ArrayList<>();
        for(int j=0; j<arr.length; j++)
        {
            if(arr[j]!=j+1)
            {
                ans.add(j+1);
            }
        }
        return ans;
   }
}
    
