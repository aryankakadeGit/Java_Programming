class ThreadDemo1{
    public static void main(String A[])
    {
        System.out.println("Inside Main Method \n");

        String name = Thread.currentThread().getName();

        System.out.println("name of current thread is : \n"+name);
    }
}