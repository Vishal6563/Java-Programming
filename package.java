import Marvellous.Arithmatic;
import Marvellous.Mathmatic;

class packageDemo
{
    public static void main(String Arg[])
    {
        Arithmatic aobj = new Arithmatic();
        Mathmatic mobj = new Mathmatic();
        
        int iRet =0;

        iRet = aobj.Addition(10,11);
        System.out.println("Addition is :"+iRet);

        iRet = aobj.Substraction(10,11);
        System.out.println("Substraction is :"+iRet);

        iRet = mobj.Square(10,11);
        System.out.println("Square is :"+iRet);

        iRet = mobj.Cube(10,11);
        System.out.println("Cube is :"+iRet);
    }
    
}
