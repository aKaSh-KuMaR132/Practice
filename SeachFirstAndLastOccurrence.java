public class SeachFirstAndLastOccurrence {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5,5,5,5,6,6,7,7,8,9};
        int target= 10;
        int[] ans = searchRange(arr,target);
        System.out.print("{"+ans[0]+","+ans[1]+"}");
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        int start = search(nums,target,true);
        int end = search(nums,target,false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }
     static int search(int[]  nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
       while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if(findStartIndex){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
        }
        return ans;
    }
}
