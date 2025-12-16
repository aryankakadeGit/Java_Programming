import java.util.*;
class ExceptionDemo2{
    public static void main(String[] args) {
        Scanner sobj=new Scanner(System.in);
        int ino1=0,ino2=0;
        float fans=0.0f;
        System.out.println("enter first number");
        ino1=sobj.nextInt();
        System.out.println("enter second number");
        ino2=sobj.nextInt();
         
        fans=(float)ino1/(float)ino2;
        System.out.println("division is "+fans);
    }

    
}