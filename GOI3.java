import java.awt.*;

class GOI3 {

    public static void main(String a[])
    {
        MarvellousFrame mobj = new MarvellousFrame("PPA");

    } 
    
}


class MarvellousFrame
{
    public Frame fobj;

    public MarvellousFrame(String title)
    {
        Frame fobj = new Frame(title);
        fobj.setSize(400,400);
        fobj.setVisible(true);
    }
}
