// write a function that prints hello world 5 times
// we have different ways to write that

public class Message 
{
    static void message() 
    {
        System.out.println("Hello World");
    /* -- Printing 5 times --   
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    */    
        // message1();
    }

/*  --- calling one function in another ---
    static void message1()
    {
        System.out.println("Hello World");
        message2();
    }

    static void message2()
    {
        System.out.println("Hello World");
        message3();
    }

    static void message3()
    {
        System.out.println("Hello World");
        message4();
    }
    static void message4()
    {
        System.out.println("Hello World");
    }

*/
    public static void main(String[] args) 
    {
        message();
    /*  -- Calling function 5 times --
        message();
        message();
        message();
        message();
    */
    }
}
