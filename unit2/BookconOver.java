public class BookconOver {
     BookconOver()
     {
        System.out.println("i am book1");
     }
     BookconOver(int i)
     {   
       System.out.println("i am book2"); 
     }
}
class ConsOver{
    public static void main(String args[]){
        BookconOver b1= new BookconOver();
     BookconOver b2= new BookconOver(2);

    }
}

