class Base{
    int a=6;
    int b=4;
    void details(){
        System.out.println("the value of a :"+a);
        System.out.println("the value of b :"+b);
    }
}
class Subclass extends Base{
    int c=a+b;
    void add(){
        System.out.println("the addition of a and b is : "+c);
    }
}
class Subsubclass extends Subclass{
    int d=c *2;
    void doublevalue(){
        System.out.println("Double the value of a and b : "+d);
    }
}
public class Multi {
    public static void main(String args[]){
        Subclass sb= new Subclass();
        sb.details();
        sb.add();
        Subsubclass ssb = new Subsubclass();
        ssb.doublevalue();
    }    
}

