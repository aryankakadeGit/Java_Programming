import java.util.*;
import java.net.*;
import java.io.*;

class AdditionClient3
{
    public static void main(String[] args) throws Exception
    {
        System.out.println("Client is running....");


        Socket sobj = new Socket("localhost" , 2100);
        System.out.println("Server Successfully CONNECTED.....");

        DataInputStream diobj=new DataInputStream(sobj.getInputStream());
        DataOutputStream doobj=new DataOutputStream(sobj.getOutputStream());

        int no1=11 , no=10 ;

        no1=doobj.writeInt(no1);
        no2=doobj.writeInt(no2);

        int sum=no1+no2;

        doobj.writeInt(sum);


        sobj.close();
        
        System.out.println("Client application terminated.....");
    }   
}
