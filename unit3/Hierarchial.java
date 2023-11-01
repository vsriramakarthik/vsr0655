class parent{
    int a=6;
    int b=4;
    void details(){
        System.out.println("the value of a :"+a);
        System.out.println("the value of b :"+b);
    }
}
class child1 extends parent{
    void add(){
        System.out.println("the value of a + b :"+a+b);
    }
}
class child2 extends parent{
    void multiply(){
        System.out.println("the value of a * b :"+a*b);
    }
}
public class Hierarchial {
    public static void main(String args[]){
        child2 c2=new child2();
        c2.details();
        c2.multiply();
        child1 c1=new child1();
        c1.add();
    }
}
