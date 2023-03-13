
public class Max_Wealth 
{

   static int max_wealth(int[][] arr) 
   {    
        int max = Integer.MIN_VALUE;
        for(int person = 0; person < arr.length; person++)
        {
            int rowsum = 0;
            for(int account =0; account< arr[person].length; account++)
            {
                rowsum+=arr[person][account];
            }
            if(rowsum>max)
            {
                max = rowsum;
            }
           
        }
        return max;
   }


    public static void main(String[] args) 
    {
        int[][] arr =  { { 5, 5, 5 },
                         {4, 4, 4, 4},
                         {8, 8, 8, 8},
                         { 10 ,10 , 10, 10}
                         };

        System.out.println(max_wealth(arr));
    }

}
