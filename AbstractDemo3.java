abstract class Base{
    public int i,j;
    public int Addition(int a , int b)
    {
        return a+b;
    }
    abstract public int Substractiom(int a , int b);
    
    
}
class Derived extends Base{
     public int Substractiom(int a , int b){
        return a-b;
     }
      public int multiplication(int a , int b){
        return a*b;
     }
}

class AbstractDemo3{
    public static void main(String A[])
    {
    
        Base bp=new Derived();
        int iret=0;
        iret=bp.Addition(11,10);
        System.out.println(iret);//21
        
        iret=bp.Substractiom(11,10);
        System.out.println(iret);//1
       // iret=bp.multiplication(11,10);//error

      

    }
}