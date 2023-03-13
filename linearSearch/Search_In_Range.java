
import java.util.Scanner;

public class Search_In_Range 
{
    private static int search_in_range(int[] arr,int target, int start, int end)
    {
               if(arr.length==0)

                 {
                    return -1;
                 }
            
                 for(int i =0; i<arr.length;i++)
                    {
                        if(arr[i]==target)
                        {
                             return i;
                        }
                    }

                return Integer.MAX_VALUE;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("enter array elements");
        for (int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("enter target element");
        int target = sc.nextInt();
        
        System.out.println("enter start element");
        int start = sc.nextInt();

        System.out.println("enter end element");
        int end = sc.nextInt();


        
        System.out.println(search_in_range(arr,target, start, end));
        sc.close();
    }

}

