
 class oop {
    public static void main(String Arg[])
    {
        System.out.println("inside main function");


        Arithmatic obj1 = new Arithmatic();
        Arithmatic obj2 = new Arithmatic(11,10);

        int iRet = 0;

        iRet = obj1.Addition();
        System.out.println("Addition is:"+iRet);

        
        iRet = obj1.Substraction();
        System.out.println("Substraction is:"+iRet);

        iRet = obj2.Addition();
        System.out.println("Addition is:"+iRet);

        
        iRet = obj2.Substraction();
        System.out.println("Substraction is:"+iRet);


    }
}
class Arithmatic
{
   public int No1;
   public int No2;

   public Arithmatic()  //Default constractor
   {
        System.out.println("inside default constractor");
       this.No1= 0;
       this.No2= 0;

   }
   public Arithmatic(int i, int j)    //parametarise constractor
   {
       System.out.println("inside default parmitarise constractor");
       this.No1= i;
       this.No2= j;

   }
   public int Addition()
   {
     
       int Ans =0;
       Ans = this.No1 + this.No2;
       return Ans;
   }
   public int Substraction()
   {
       int Ans =0;
       Ans = this.No1 - this.No2;
       return Ans;
   }
}

//it just creat the         
