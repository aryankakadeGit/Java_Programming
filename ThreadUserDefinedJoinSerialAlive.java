 class Demo extends Thread
 {
    public void run()
    {
        System.out.println( "Inside run method of " + Thread.currentThread().getName());

    }
 }
 class ThreadUserDefinedJoinSerialAlive 
 {
    public static void main(String[] args)  
    {
        System.out.println("Inside main thread");
        Demo dobj1=new Demo() ;
        Demo dobj2=new Demo() ;

        dobj1.setName("First");
        dobj2.setName("Second");
       

        //checked exception
        try{ 
            dobj1.start();   
            System.out.println("is first thread Alive ? "+ dobj1.isAlive());

            dobj1.join();  
            System.out.println("End of first thread");

            System.out.println("is first thread Alive ? "+ dobj1.isAlive());
            dobj2.start();
            dobj2.join();
            System.out.println("End of Second thread");

        }
        catch(InterruptedException iobj)
        {

        }

       
        System.out.println("End of main Thread");
    }
    
}


