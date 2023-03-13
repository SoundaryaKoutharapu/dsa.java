// Counting the no. of numbers in a number
// return the number if the count is even

public class Even_digits 
{
    static int numOfDigits(int[] arr)
    {
        int count_1 =0;
        int i=0;
       
        for( i=0;i<arr.length;i++)
        {
            int num = arr[i];
            if(even(num)%2==0)
            {
              count_1+=1;
            }

        }    
            return count_1;
    }

    static int even(int num)
    {
        int count_2 =0;
        if(num<0)
        {
            num=num*-1;
        }
        if(num==0)
        {
            return 1;
        }
        while(num>0)
        {
            num =num/10;
            count_2+=1;
        }
        return count_2;
    }


    public static void main(String[] args) 
    {
        int[] arr = {12,345,7890,2,6,8900,-89};
        System.out.println(numOfDigits(arr));
    }
}
