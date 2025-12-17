import java.util.Scanner;
class SequenceDemo {
    public static void  main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        int istd=0;
        System.out.println("enter ypur standard ");
        istd=sobj.nextInt();
        if( istd==1)
        {
            System.out.println("Exam at9am");
        }
        else if( istd==2)
        {
            System.out.println("Exam at10am");
        }
        else if( istd==3)
        {
            System.out.println("Exam at11am");
        }
        else if( istd==4)
        {
            System.out.println("Exam at12am");
        }
        else{
            System.out.println("Invalid Standard ");
        }

        
    }
}