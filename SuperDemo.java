 class Hello {
    public int i;
    public Hello(int no)
    {
        System.out.println("inside Hwllo constructor");
        this.i=no;
    }
    public void Display()
    {
        System.out.println("inside Hello Display");
    }
 }
 class Demo extends Hello{
    public int i;
    
    public Demo(int a){
        super(a); //first use
        System.out.println("inside Demo constructor");

        this.i=a; 

    }
   
    public void Display(){
    int i=0;
    System.out.println("inside Display"+i); 
    System.out.println("inside Display"+this.i); 
    System.out.println("inside Display"+super.i); //second use
    super.Display();//third use


    } 
 }
 
 class SuperDemo {
    public static void main(String[] args) {
        Demo dobj=new Demo(51);
        dobj.Display();
               
    }
    
}
