package previous;

public class OLX {
    public static void main(String[] args){
        System.out.println("Hello");

        int[] arr = {2,4,6, 10,10,10, 14};

        int[] arr1 = {2,0,3};
        int element = 14;
    //    System.out.println(leftMostOcccurance(arr, element));
     //   System.out.println(rightMostOcccurance(arr,element));
        System.out.println(canJump(arr1,0));

    }

    static boolean canJump(int[] arr, int index){
        int n = arr.length;
        if(index >= n){
            return false;
        }
        if(index == n - 1){
            return true;
        }
        int maxJumps = arr[index];
        boolean canJump = false;
        for(int i = 1; i <= maxJumps; i++){
            canJump = canJump || canJump(arr, index + i);
        }
        return canJump;
    }

    static int leftMostOcccurance(int[] arr, int element){
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        while(left <= right){
            int mid = (left + right)/ 2;
            if(arr[mid] == element && (mid == 0 || arr[mid] == arr[mid - 1] ) ){
                right = mid - 1;
            }
            else if(arr[mid] == element){
                return mid;
            }
            else if(arr[mid] < element){
                left = mid + 1;
            }
            else{
                right = mid -1;
            }
        }
        return -1;
    }

    static int rightMostOcccurance(int[] arr, int element){
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        while(left <= right){
            int mid = (left + right)/ 2;
            if(arr[mid] == element && (mid == n - 1 || arr[mid] == arr[mid + 1] ) ){
                left = mid + 1;
            }
            else if(arr[mid] == element){
                return mid;
            }
            else if(arr[mid] < element){
                left = mid + 1;
            }
            else{
                right = mid -1;
            }
        }
        return -1;
    }



}
