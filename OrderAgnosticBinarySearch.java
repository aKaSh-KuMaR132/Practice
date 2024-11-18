public class OrderAgnosticBS {
    public static void main(String[] args) {

        int[] arr = {50,48,46,44,42,40,38,36,34,32,30,28,26,24,22,20};
        int target = 26;
        System.out.println(orderAgnosticBS(arr,target));
    }
    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end  = arr.length -1;

        boolean isAsc = arr[start] < arr[end];

        while(start<=end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(target<arr[mid]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }else{
                if(target>arr[mid]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}
