import java.util.*;

public class input {
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first number :");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter second number :");
        int iNo2 = sobj.nextInt();

        int iAns = 0;
        iAns = iNo1 + iNo2;
        System.out.println("Addition is : "+iAns);

        sobj.close();

    }
    
}

/* 
Data type    Method form Scanner 

boolean      nextBoolean();
short        nextShort();
int          next



*/