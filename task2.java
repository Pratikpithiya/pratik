public class task2{
public static void main(String[] args) {
    int arr1[]={1,10,2,3,5,6,7};
    int arr2[]={2,4,6,8,1,0,2};
    int result[]=new int [arr1.length];
    for(int i=0;i<arr1.length;i++){
        result[i]=arr1[i]*arr2[i];
    }
    for(int i=0;i<arr1.length;i++){
        System.out.println(result[i]);
    }
    
    }
}