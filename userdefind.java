import java.util.*;
class AgeInvalid extends Exception
{
    public static void main(String str)
    {
        super(str);
    }
}
class Userdefind
{
    public static void main(String Arg[]) throws Exception
    {

        int Age = 0;
        Scanner sobj = new Scanner(System.in);

        try
        {
            System.out.println("Enter your age");
        Age = sobj.nextInt();
        if(Age < 18)
        {
            throw new AgeInvalid("Age is less than 18");
        }
     }
     catch(AgeInvalid obj)
     {
         System.out.println(obj);
     }
     finally
     {

     }

    }
}