class Generic2
{
    public static <T> void Display(T Arr[])
    {
        for(T no : Arr)    //foreach
        {
            System.out.println(no);
        }
    }
    public static void main(String Arg[])
    {
        Integer A[] = {10,20,30,40};
        Float B[] = {50.89f,60.70f,70.06f};
        Double C[] = { 50.40,40.40,40.30};

        Display(A);
        Display(B);
        Display(C);
    }
}