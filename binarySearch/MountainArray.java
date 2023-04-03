
// https://leetcode.com/problems/find-peak-element/

/* public class MountainArray
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
        int[] arr = {8, 10, 43, 14, 16, 18, 2, 17, 15, 13, 11, 9};
        int ans = searchMountain(arr);
        System.out.println(ans);
    }
}
*/

public class MountainArray
{

    public static void main(String[] args) 
    {
        //int[] arr = {16,20,31,4,4,4,0,2,0,1};  /
        //int[] arr = {1,1,1,1,1,1,1,1};   // all numbers same
        //int[] arr = {3};                 // single index
        int[] arr = {1,2,2,5,6,7,7,8,3,2,1,1,9,9,0};
        System.out.println(bsSearch(arr));
    }

    static int bsSearch(int[] arr) 
    {
        int start = 0;
        int end  = arr.length-1;

        while(start<=end)
        {
            int mid = start + (end-start)/2;

            if(mid==0 || arr[mid]>=arr[mid-1] && mid==arr.length-1 || arr[mid]>=arr[mid+1] )
            {
                return mid;
            }
            else if(arr[mid]<=arr[mid]-1)
            {
                end = mid;
            }
            else 
            {
                start = mid+1;
            }
        }

        return -1;
    }
}

