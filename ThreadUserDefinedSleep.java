 //code to demonstrate thread schedulling
 class Demo extends Thread{
    public void run()
    {
        int i=0;
        for(i=1;i<=5;i++)
        {
             System.out.println("inside run method of "+Thread.currentThread().getName());

        }

    }
}
 
 class ThreadUserDefinedSleep {
    public static void main(String[] args)  
    {
        System.out.println("Inside main thread");
        Demo dobj1=new Demo() ;
        Demo dobj2=new Demo() ;

        dobj1.setName("First");
        dobj2.setName("second");
       
        
        //checked exception
        try{ 
             
            dobj2.join();

            dobj1.join();  
            dobj1.start();  
            dobj2.start();
            
        }
        catch(InterruptedException iobj)
        {

        }

       
        System.out.println("End of main Thread");
    }
    
}


