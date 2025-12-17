import java.util.Scanner;
class SwitchDemo {
    public static void  main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        int istd=0;
        System.out.println("enter ypur standard ");
        istd=sobj.nextInt();
        
        switch(istd)
        {
            
            case 1:
            System.out.println("exam at 9 am ");
            break;

            case 2:
            System.out.println("exam at 10 am ");
            break;
            case 3:
            System.out.println("exam at 11 am ");
            break;
            case 4:
            System.out.println("exam at 12 am ");
            break;
            default :
            System.out.println("invalid entry ");
            break;
        }
    }
}