// Floor of a number: greatest number lesser than or equal to target element 

public class Floor 
{

    static int binary(int[] arr, int target)
    {
        int start =0;
        int end= arr.length-1;

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
            return end;
    }

    public static void main(String[] args) 
    {
            int[] arr =  {12,34, 56, 67,78,89,90,123};
            int target=32;
            System.out.println(binary(arr,target));
    }
}
    

