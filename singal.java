
public class singal 
{
    public static void main(String Arg[])
    {
        Derived dobj = new Derived();
        dobj.fun();
        dobj.gun();

        System.out.println(dobj.A);
        System.out.println(dobj.B);
        System.out.println(dobj.X);
        System.out.println(dobj.Y);

    }
    
}
class Base
{
    public int A;
    public int B;

    public Base()
    {
        System.out.println("inside Base constractor");
        this.A =11;
        this.B =21;
    }
    public void fun()
    {
        System.out.println("inside base fun");
    }
}
class Derived extends Base
{
    public int X;
    public int Y;
    public Derived()
    {
        System.out.println("inside Derived constractor");
        this.X =51;
        this.Y =101;
    }
    public void gun()
    {
        System.out.println("inside Derived constractor");
        
       
    }
}
