package Assignment6;

public class Q3 {
    public static boolean checkMountain(int[] arr){
        if(arr.length < 3){
            return false;
        }

        int l = 0;
        int r = arr.length-1;
        while(l + 1 < r && arr[l] < arr[l+1]) {
            l++;
        }
        while(r-1>0 && arr[r] < arr[r-1]){
            r--;
        }

        if(l!=arr.length-1 && r != 0 && l==r){
            return true;
        }
        return false;

            
    }

    public static void main(String[] args) {
        int[] arr = {2,1};
        System.out.println(checkMountain(arr));
    }
    
}
