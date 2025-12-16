interface Demo {
    int No=11;
    void Display()
    {

    }
}
class Hello implements Demo{
 //error
}
class Interfacedemo1{
    public static void main(String[] args) {
        Hello hobj=new Hello();
    }
}