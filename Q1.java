package Assignment6;
import java.util.*;


public class Q1 {
    public static int[] numConversion(String s){
        
        int n = s.length();
        int[] num = new int[n+1];
        
        int hi = n;
        int li = 0;
        int j=0;
      
        for(char c : s.toCharArray()){
            if(c == 'I'){
                num[j++] = li;
                li++;
            }
            else{
                num[j++] = hi;
                hi--;
            }

        }
        num[j] = li;
        return num;


        }

    public static void main(String[] args) {
        String s = "IDID";
        System.out.println(Arrays.toString(numConversion(s)));



    }
}
