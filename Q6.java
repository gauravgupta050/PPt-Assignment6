package Assignment6;
import java.util.*;
 

public class Q6 {
    
    public static List<Integer> findOriginal(int[] arr){
        Map<Integer, Integer> numFreq = new HashMap<>();  
        for (int i = 0; i < arr.length; i++){  
            numFreq.put(arr[i], numFreq.getOrDefault(arr[i], 0)+ 1);  
        }  
        Arrays.sort(arr);  
        List<Integer> res = new ArrayList<>();  
        for (int i = 0; i < arr.length; i++){  
            int freq = numFreq.get(arr[i]);  
            if (freq > 0){  
                res.add(arr[i]);  
                numFreq.put(arr[i], freq - 1);  
                int twice = 2 * arr[i];  
                numFreq.put(twice, numFreq.get(twice) - 1);  
            }  
        }  
        return res;  
        } 
    

    public static void main(String[] args) {
        int[] arr = {1,3,4,2,6,8};
        System.out.println("The original array is "+ findOriginal(arr));
    }
    
}

