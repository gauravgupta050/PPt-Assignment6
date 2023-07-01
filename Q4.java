package Assignment6;

public class Q4 {

    public static int contiguousArray(int[] arr){
        int count = 1;
        int maxi = 0;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] != arr[i+1]){
                count++;
                maxi = Math.max(count, maxi);
            }
            else{
                count = 1;
            }

            
        }
        return maxi;



    }
    public static void main(String[] args) {
        int[] arr = {0,1,0,1,1,0};
        System.out.println(contiguousArray(arr));
    }
    
}
