// Numbers Program to understand recursion and function call in stack

public class NumberProgramRecursion 
{
    public static void main(String[] args) 
    {
       print(1);   
    }

    static void print(int i) 
    {
       if(i<10)
        {
        System.out.println(i);
        print(i+1);
        }
    }
    
}
