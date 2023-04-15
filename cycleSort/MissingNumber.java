//  https://leetcode.com/problems/missing-number/

import java.util.Arrays;

public class MissingNumber 
{
    public static void main(String[] args) {
        //int[] arr = {3,0,1};
        int [] arr = {9,6,4,2,3,5,7,0,1};
        int ans = missingSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(ans);
    }

    static int missingSort(int[] arr) 
    {
        int i = 0;
        while(i<arr.length)
        {
            int correctIndex = arr[i];
            if(arr[i]< arr.length && arr[i]!=arr[correctIndex])
            {
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }
            else
                i++;
        }

        for(int j=0; j<arr.length; j++)
        {
            if(arr[j]!=j)
            {
                return j;
            }
            
        }
        return arr.length;
    }
}
