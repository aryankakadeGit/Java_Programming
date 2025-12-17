 class Demo{
    public int i;
    public static int j;

    static{
        j=21;
    }
    public Demo(){
        System.out.println("inside Default ");

        this.i=11; //first use

    }
    public Demo(int a)
    {
        this();  //secomd use
        System.out.println("inside parameterized ");
    }
    public void Display(){
        System.out.println("inside Display"+this.i); //third use
    }
 }
 
 class Thisdemo {
    public static void main(String[] args) {
        Demo dobj=new Demo(51);
        dobj.Display();        
    }
    
}
