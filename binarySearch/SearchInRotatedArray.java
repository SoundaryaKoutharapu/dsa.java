public class SearchInRotatedArray 
{

  // method to find pivot element

   static int findPivot(int[] arr)
   {
      int start = 0;
      int end =  arr.length-1;

      while(start<=end)
      {
      int mid = start+(end-start)/2;

      // 4 Cases
    
      if(mid < end && arr[mid]>arr[mid+1])
      {
        return mid;
      }
      if(mid > start && arr[mid-1]>arr[mid])
      {
        return mid-1;
      }
      if(arr[mid]<=arr[start])
      {
        end = mid-1;
      }
      else
      {
        start = mid+1;
      }
    }
    return -1;
} 


    static int pivotBinarySearch(int[] arr, int target)
    {
        int pivot = findPivot(arr);
        if(pivot==-1)
        {
            // just return normal binary search
            return binary(arr, target, 0, arr.length-1);
        }
        
        if(arr[pivot]==target)
        {
            return pivot;
        }
       else if(arr[0]>target) 
        {
             return binary(arr, target, pivot+1, arr.length-1);
         }
       else    
             return binary(arr, target,0, pivot-1 ); 
    }


// Binary Search

    static int binary(int[] arr, int target, int start, int end)
    {

        while(start<=end)
        {
            int mid = start+(end-start)/2;

            if(target>arr[mid])
                {
                    start=mid+1;
                }
            else  if(target<arr[mid])
                {
                    end=mid-1;           
                }
            else
            {
                return mid;
            }         
        }
            return -1;
    }




    public static void main(String[] args) 
    {
       // int[] arr = {4,5,6,7,8,0,1,2,3};
       int[] arr = {0};
        int target = 0;
        int ans = pivotBinarySearch(arr, target);
        System.out.println(ans);
    }
}
