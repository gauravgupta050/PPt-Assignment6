package Assignment6;

public class Q2 {
    public static boolean find(int[][] arr,int target){
        if(arr.length == 0 || arr[0].length == 0){
            return false;
        }
        int lo = 0;
        int hi = arr.length-1;
        int targetRow = -1;
        
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid][arr[0].length-1] == target){
                return true;
            }
            else if(arr[mid][arr[0].length-1] < target){
                lo = mid+1;
            }
            else{
                targetRow = mid;
                hi = mid-1;
            }

        }
        if(targetRow == -1){
            return false;
        }

        lo= 0 ;
        hi = arr[0].length -1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[targetRow][mid] == target){
                return true;
            }
            else if(arr[targetRow][mid] < target){
                lo = mid+1;
            }
            else{
                hi = mid-1;
            }


        }
        return false;


    }

    public static void main(String[] args) {
        int[][] arr = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
        System.out.println(find(arr, target));
    }
    
}
