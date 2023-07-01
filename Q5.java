package Assignment6;
import java.util.*;

public class Q5 {

    public static int productSum( int[] arr1, int[] arr2){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int sum = 0;

        if(arr1.length != arr2.length){
            return 0;
        }
        int n = arr1.length;
        for(int i=0;i<n;i++){
            
            int mul = arr1[i]*arr2[n-1-i];
            sum = sum + mul;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr1 = {5,3,4,2};
        int[] arr2 = {4,2,2,5};
        System.out.println(productSum(arr1, arr2));




    } 
    
}
