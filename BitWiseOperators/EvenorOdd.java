// Find even or odd number
// use & operator = if any number & with 1 result in that number itself
// so, do number & 1 = if the last digit is 1 then it is odd number else even number
// In a number (binary) (eg: 1011) except last digit remaining are power of 2 -> means except last digit remaining are even


public class EvenorOdd
{ 

    public static void main(String[] args) {
        int number = 111;
        System.out.println(evenOrOdd(number));
    }

     static boolean evenOrOdd(int number) {
        return (number & 1) == 1 ;
    }
}