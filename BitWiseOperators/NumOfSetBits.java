public class NumOfSetBits {
    public static void main(String[] args) {
        int num = 0;
        System.out.println(Integer.toBinaryString(num));
        int counter = 0;
        while (num > 0 ) 
        {     
               counter++;
                num -= (num & -num) ; 
        }
        System.out.println(counter);
        }
    }