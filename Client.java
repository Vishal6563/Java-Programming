
import java.net.*;
import java.io.*;

class Client 
{
    public static void main (String Arg[]) throws Exception
    {
        System.out.println("Client Application is Running...");
        
        System.out.println("cilent is wetting for canection");
        Socket s = new Socket("localhost",2100);
 
        PrintStream ps = new PrintStream(s.getOutputStream());

        BufferedReader br1 = new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Chat massenger started");
        String str1,str2;
        while(!(str1 = br2.readLine()).equals("end"))
        {
            ps.println(str1);
            System.out.println("Enter massg for server :");
            str2 = br1.readLine();

            System.out.println("Server says : "+str2);

        }
    }
}
