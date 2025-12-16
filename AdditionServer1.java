import java.util.*;
import java.net.*;
import java.io.*;

class AdditionServer1 
{
    public static void main(String[] args) throws Exception
    {
        System.out.println("Server is running....");
        ServerSocket ssobj = new ServerSocket(2100);
        System.out.println("Server is Waiting at port 2100......");
        Socket sobj = ssobj.accept();
        System.out.println("Client request arrives and accepted by server......");

    }
    
}
