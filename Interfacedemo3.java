interface Demo {
    int No=11;
    void Display();
}
 class Hello implements Demo{
     public void Display()
     {
        System.out.println("inside Display");
     }
}
class Interfacedemo3{
    public static void main(String[] args) {
        System.out.println(Demo.No);//NO is public & static
        //Demo.No=12; No is Final
        Hello hobj=new Hello();
        hobj.Display();
    }
}