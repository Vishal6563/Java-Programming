public class abstractDemo {

    public void main(String Arg[])
    {
        SBI sobj = new SBI();
        BOM bobj = new BOM();

        sobj.DisplayRules();
        bobj.DisplayRules();

        float fRet = 0.0f;
        fRet = sobj.calculateROI();
        System.out.println("ROI of  SBI :"+fRet);

        // fRet = bobj.calculateBOM();
        // System.out.println("ROI of  BOM :"+fRet);
      
    }
    
}


abstract class RBI
{
    public abstract float calculateROI();

     public void DisplayRules()
     {
        System.out.println("you have to submit adhar and pan card");
        System.out.println("mimnimum balance is 10.000");
     }
}
class SBI extends RBI
{
    public float calculateROI()
    {
        return 5.7f;
    }
}
class BOM extends RBI
{
    public float calculateROI()
    {
        return 7.7f;
    }
}
