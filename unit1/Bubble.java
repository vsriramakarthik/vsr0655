public class Bubble {
    public static void main(String args[])
    {
        int a[]={ 22, 9, 10, 76, 61};
        int n=a.length;
        Bubble(a);
        for(int i;i<n;i++){
            System.out.println(a[i]);
        }

    }
    public static void Bubble(int a[])
    {
        int n = a.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(a[j-1] > a[j]){  
                                 //swap elements  
                                 temp = a[j-1];  
                                 a[j-1] = a[j];  
                                a[j] = temp;  
                         }  
                          
                 }       
            }
    }
}
