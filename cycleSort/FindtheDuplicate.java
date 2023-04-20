// https://leetcode.com/problems/find-the-duplicate-number/
/* 
public class FindtheDuplicate
{
    public static void main(String[] args) 
    {
       // int[] arr = {4,3,2,7,8,2,3,1};
        int[] arr = {3,1,3,4,2};
        System.out.println(cyclesort(arr));
    }

   public static int cyclesort(int[] arr)
   {
        int i=1;
        int duplicate = 0;
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
                duplicate = arr[j];
            }
        }
       return duplicate;
   }
}
*/ 


// Method --> 2 
public class FindtheDuplicate
{
    public static void main(String[] args) 
    {
        int[] arr = {3,1,3,4,2};
        System.out.println(cyclesort(arr));
    }

  static int cyclesort(int[] arr)
   {
        int i =1;
    while(i<arr.length)
     {
        int correctIndex = arr[i] - 1;
        if(arr[i]!=i+1)
        {
            if(arr[correctIndex]!=arr[i])
            {
                int temp =arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }
            else
            {
                return arr[i];
            }
        }
        else
            i++;
     }
     return -1;
   }
}