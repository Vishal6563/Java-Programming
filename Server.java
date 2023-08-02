import java.net.*;
import java.io.*;

class Server 
{
    public static void main (String Arg[]) throws Exception
    {
        System.out.println("Server Application is Running...");
        ServerSocket ssobj = new ServerSocket(2100);
        System.out.println("Server is runnong port no : 2100");

        Socket s = ssobj.accept();
        System.out.println("Server and clint connection is succussfull");

        PrintStream ps = new PrintStream(s.getOutputStream());

        BufferedReader br1 = new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
       
        System.out.println("Chat massenger started");
        String str1,str2;
        while((str1 = br1.readLine())!= null)
        {
            System.out.println("Clinr say : "+str1);
            System.out.println("Enter message for client :");
            str2 = br2.readLine();
            ps.println(str2);

        }
        System.out.println("thank you for using for massanger");
    }
}

