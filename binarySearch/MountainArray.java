public class MountainArray
{
   static int searchMountain(int[] arr) 
   {
       int start = 0;
       int end = arr.length-1;

       while(start!=end)
       {
        int mid = start+(end-start)/2;
         if(arr[mid]>arr[mid+1])
         {
            end = mid;
         }
         else
            start = mid+1; 
       }

        return start;
   }
 


    public static void main(String[] args)
    {
        int[] arr = {8, 10, 12, 14, 16, 18, 20, 17, 15, 13, 11, 9};
        int ans = searchMountain(arr);
        System.out.println(ans);
    }
}