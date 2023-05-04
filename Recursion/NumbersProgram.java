// write a function that takes in a number and prints it
// print first 5 numbers

public class NumbersProgram 
{
    public static void main(String[] args) 
    {     
        print(1);
    }

    static void print(int n) 
    {
        System.out.println(1);
        print1(2);
    }

    static void print1(int n) 
    {
        System.out.println(n);
        print2(3);
    }
    
    static void print2(int n) 
    {
        System.out.println(n);
        print3(4);
    }
    
    static void print3(int n) 
    {
        System.out.println(n);
        print4(5);
    }
   
    static void print4(int n) 
    {
        System.out.println(n);     
    }

}
