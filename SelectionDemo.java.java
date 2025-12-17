import java.util.Scanner;
class SequenceDemo {
    public static void  main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        int ino=0;
        System.out.println("enter ypur sge ");
        ino=sobj.nextInt();
        if(ino>+18)
        {
            System.out.println("you can vote");

        }
        else{
            System.out.println("You Cant Vote");
        }

        
    }
}