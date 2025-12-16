import java.util.*;
import java.net.*;
import java.io.*;

class AdditionClient2 
{
    public static void main(String[] args) throws Exception
    {
        System.out.println("Client is running....");


        Socket sobj = new Socket("localhost" , 2100);
        System.out.println("Server Successfully CONNECTED.....");

        DataInputStream diobj=new DataInputStream(sobj.getInputStream());
        DataOutputStream doobj=new DataOutputStream(sobj.getOutputStream());
    }
    
}
