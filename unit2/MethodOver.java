public class MethodOver {
    int l=5,b=5,h=5;
    void volume(){
        System.out.println("volume:"+l*b*h);
    }
    void volume(int x,int y){
        l=x;
        b=y;
        System.out.println("volume:"+l*b*h);
    }
    void volume(int l,int b,int h){
        this.l=l;
        this.b=b;
        this.h=h;
        System.out.println("volume:"+l*b*h);
    }
}
class ConsImpl{
    public static void main(String args[])
    {
        MethodOver c1 = new MethodOver();
        c1.volume();
        MethodOver c2 = new MethodOver();
        c2.volume(1,2);
       MethodOver c3 = new MethodOver();
       c3.l=1;
       c3.b=1;
       c3.h=1;
       c3.volume();
       MethodOver c4 = new MethodOver();
       c4.volume(2,2,2);
    }
}
