import java.util.*;
import java.net.*;
import java.io.*;

class AdditionServer3
{
    public static void main(String[] args) throws Exception
    {
        System.out.println("Server is running....");
        ServerSocket ssobj = new ServerSocket(2100);
        System.out.println("Server is Waiting at port 2100......");
        Socket sobj = ssobj.accept();
        System.out.println("Client request arrives and accepted by server......");

        DataInputStream diobj=new DataInputStream(sobj.getInputStream());
        DataOutputStream doobj=new DataOutputStream(sobj.getOutputStream());
        
        int no1=0 , no2=0 ;

        no1=diobj.readInt(no1);
        no2=diobj.readInt(no2);



        int sum=diobj.readInt();
        System.out.println("Addition is : "+sum);

        sobj.close();
        ssobj.close();
        System.out.println("Server application terminated.....");
    }    
}
