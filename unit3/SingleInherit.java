
class A{
    int a=6;
    int b=4;
    int c=a+b;
    void details(){
        System.out.println("the value of a :"+a);
        System.out.println("the value of b :"+b);
    }
}
class B extends A{
        
    
    void add(){
                
        System.out.println("The addition of a and b is : "+c);
    }
}
public class SingleInherit {
    public static void main(String args[]){
        B b1 =new B();
        b1.details();
       b1.add();

    }
}