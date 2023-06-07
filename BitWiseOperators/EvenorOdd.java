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