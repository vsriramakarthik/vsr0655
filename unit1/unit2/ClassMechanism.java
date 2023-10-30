class ClassMechanism {
    int l=5,b=5,h=5;
    void volume(){
        System.out.println(l*b*h);
    }}
class DemoBox{
    public static void main(String args[]){
        ClassMechanism b1= new ClassMechanism();
        b1.volume();
        
    }
}
