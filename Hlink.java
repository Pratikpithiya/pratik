import java.util.*;
public class Hlink {
    public static void checkIndex(int a, int [] arr){
        int c = 0;
        for (int i = 0; i<arr.length; i++ ){
            if(arr[i]==a){
                c++;
                System.out.println(i);
            }
        }
        if (c<1) {
         System.out.println(a + " is not available in given set");
    }
        

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] arr = {1,2,3,4,5};
        System.out.println(" Enter the given number to search : ");
        int a=sc.nextInt();
        checkIndex(a,arr);
        
    }
}
