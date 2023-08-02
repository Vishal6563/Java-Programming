
public class superDemo
{
    public static void main(String Arg[])
    {
        Derived dobj = new Derived();
        dobj.gun();
        
    }   
}
class Base
{
    public int A;

    public Base()
    {
        System.out.println("inside Base  Default constractor");
        this.A = 11;
    }
    public Base(int i)
    {
        System.out.println("inside base paramitarise constractor");
    }
    public void fun()
    {
        System.out.println("inside base fun");
    }
}

class Derived extends Base
{
    public int X;
    public Derived()
    {
        super(11);
        System.out.println("inside Derived constractor");
        this.X =51;
        
    }
    public void gun()
    {
        System.out.println("inside Derived constractor");
        System.out.println("value of A :"+super.A);
        System.out.println("value of A :"+A);
        System.out.println("value of A :"+this.A);

        super.fun();
    }
}
