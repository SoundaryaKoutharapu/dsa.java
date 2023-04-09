import java.util.Arrays;

public class ArraysEqualOrNot 
{
	public static void main (String[] args) 
    {
         int[] arr = {1,5,7,0,12,4,8};
         int[] brr = {1,5,7,0,12,4};
		System.out.println(check(arr,brr)==true?"1":"0");		  
		 
	}

    public static boolean check(int[] arr,int[] brr)
    {
        if(arr.length!=brr.length)
        {
            return false;
        }

        Arrays.sort(arr);
        Arrays.sort(brr);

         for(int i=0; i<arr.length; i++ )
         {
                 if(arr[i]!=brr[i])
                 return false;
                    
        }
                  
         return true;
    }
   
}

