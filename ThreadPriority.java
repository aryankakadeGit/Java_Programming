class ThreadPriority {
    public static void main(String[] args) {
         System.out.println("Inside Main Method \n");
        Thread tobj=Thread.currentThread();
        String name = tobj.getName();

        System.out.println("name of current thread is : \n"+name);
        int priority =  tobj.getPriority();
        System.out.println("priority of current thread is : " + priority);
        tobj.setPriority(10);
        priority =  tobj.getPriority();
        System.out.println("priority of current thread is : " + priority);
    }    
}
