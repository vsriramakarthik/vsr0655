public class Linear {
    public static void main(String args[]){
        int a[] = {10, 20, 25, 63, 96, 57};
        int size = a.length;
        int key = 63;
  
        for (int i=0 ;i< size-1; i++){
           if(a[i]==key){
                 System.out.println("Element found index is :"+ i);
           }else{
              System.out.println("Element not found");
           }
        }
     }
}
