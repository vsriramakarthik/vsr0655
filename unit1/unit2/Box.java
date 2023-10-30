public class Box {
    int l=5,b=5,h=5;
    String colur;
    static int count=5;
    //constructor overloading
    Box(){
        System.out.println("i am Box constructer");
    }
    Box(int x){
        System.out.println("Hello!this is constructer overloading");
    }
    //useage of STATIC keyword for method
    static void totalboxes(){
        System.out.println("Total boxes are :"+count);
    }
    //METHOD OVERLOADING
    void properties(){
        System.out.println("Box is in colour:"+colur);
        System.out.println("Box is of volume:"+l*b*h);
    }
    void properties(String a,int x,int y,int z){
        colur=a;
        l=x;
        b=y;
        h=z;
        System.out.println("Box is in colour:"+colur);
        System.out.println("Box is of volume:"+l*b*h);

    }
    //USEAGE OF "THIS" KEYWORD
    void properties(int l,int b,int h){
        this.l=l;
        this.b=b;
        this.h=h;
        System.out.println("Box is in colour:"+colur);
        System.out.println("Box is of volume:"+l*b*h);

    }
    //MAKING OF NESTED CLASSES
    class BabyBox{
        String col="blue";
        //USEAGE OF "FINAL" KEYWORD
        final int babybox_size=50;
        void display(){
            System.out.println("I am baby box of colur :"+col+" and of size :"+babybox_size);
        }
    }
    
}
class BoxAccess{
    public static void main(String args[]){
        //Retriving the constructer
            Box b1= new Box();
            Box b2= new Box(3);
        //DISPLAYING STATIC METHOD
            Box.totalboxes();
        //DISPLAYING THE METHODS WITH OBJECTS
            Box b3=new Box();
            b3.properties();
            Box b4=new Box();
            b4.properties(1,1,1);
            Box b5=new Box();
            b5.properties("green",2,3,1);
        //DISPLAYING THE "NESTED CLASSES"
            Box b6=new Box();
            Box.BabyBox bb1 = b6.new BabyBox();
            bb1.display();

    }
}
