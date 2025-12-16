interface A{
    void fun();

}
interface B{
    void gun();
}
class Demo implements A,B{
    public void fun(){
        System.out.println("inside fun");
    }
    public void gun()
    {
        System.out.println("inside gun");

    }

}
class Interfacedemo4{
    public static void main(String[] args) {
        Demo dobj=new Demo();
        dobj.fun();
        dobj.gun();
        
        
    }
}