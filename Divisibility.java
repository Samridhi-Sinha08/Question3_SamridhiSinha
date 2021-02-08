import java.util.*; 
  
public class Divisibility 
{ 
    static int arr[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
     int  findIndex (int[] arr, int t) {
        if (arr == null) return -1;
        int len = arr.length;
        int i = 0;
        while (i < len) {
            if (arr[i] == t) return i;
            else i=i+1;
        }
        return -1;
    }
    public static void main(String args[]) 
    { 
        Divisibility ob = new Divisibility ();
       for(int i=0; i<arr.length;i++)
       {
           if(arr[i]%2==0)
           {
               System.out.println("Index of "+ arr[i] + "=" +ob.findIndex(arr,arr[i]));
           }
       }
    } 
} 