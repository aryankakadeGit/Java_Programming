class Base{ //8
    public int i,j;
    public void fun()
    {
        System.out.println("Inside base fun");
    }
}

class Derived extends Base { //12
    public int x;
    public void gun()
    {
        System.out.println("inside Derived Gun");
    }
}
class Single{
    public static void main ( String a[]){
        Base bobj = new Base() ;
        Derived dobj= new Derived();
        bobj.fun();
        dobj.fun();
        dobj.gun();

    }
}