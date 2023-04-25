public class SearchInsertPosition
{
    public static void main(String[] args)
    {
         int[] arr = {1,3,5,6};
          int target = 2;
        int ans = searchPosition(arr,target);
        System.out.println(ans);
    }

   static int searchPosition(int[] arr, int target) 
   {
    int start = 0;
    int end = arr.length-1;

    while(start!=end && arr.length!=0)
    {
     int mid = start+(end-start)/2;
      if(target>arr[mid])
      {
         start = mid+1; 
      }
      else if(target<arr[mid])
      {
         end = mid;
      }
      else
          return mid;
    }

     return start;
 }
    
   }

