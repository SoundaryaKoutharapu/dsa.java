

public class FindMinIndexOfDuplicateInMountainArray
{
           static int search(int[] arr, int target)
            {
                int peek = peekIndexMountain(arr);
                int firstTry = binary(arr, target, 0,peek);
                if(firstTry!=-1)
                {
                    return firstTry;
                }
                
                return binary(arr, target, peek+1, arr.length-1);
               
            }
    

       static int peekIndexMountain(int[] arr) 
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


       static int binary(int[] arr, int target, int start, int end)
       {
           boolean isAsc = arr[start]<arr[end];
   
           while(start<=end)
           {
               int mid = start+(end-start)/2;
   
               if(target==arr[mid])
                {
                    return mid;
                }
            
            if(isAsc)
            {
                if(target<arr[mid])
                   {
                       end = mid-1;
                   }
               else 
                   {
                       start=mid+1;          
                   }      
           }
            else
            {
               if(target>arr[mid])
                   {
                       end = mid-1;
                   }
               else 
                   {
                       start=mid+1;          
                   }      
           }
        }  
               return -1;
       }

       public static void main(String[] args)
       {
           int[] arr = {8, 10, 12, 14, 16, 18, 20, 17, 15, 14, 11, 9};
           int target = 14;
           int ans =  search(arr, target);
           System.out.println(ans);
       }

}
