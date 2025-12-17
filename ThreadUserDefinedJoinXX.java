 class Demo extends Thread{
    public void run()
    {
        System.out.println("inside run method of "+Thread.currentThread().getName());

    }
}

 class ThreadUserDefinedJoinXX {
    public static void main(String[] args)  
    {
        System.out.println("Inside main thread");
        Demo dobj1=new Demo() ;
        Demo dobj2=new Demo() ;

        dobj1.setName("First");
        dobj2.setName("second");
        dobj1.start();
        dobj2.start();
        
        //checked exception
        try{
            dobj1.join();  
            dobj2.join();
        }
        catch(InterruptedException iobj)
        {

        }
        
        System.out.println("End of main Thread");
    }
    
}


