public class SortingInArray {
    public static void main(String[] args) {
        int[] arr = {52, 85, 74, 96, 12, 45, 63};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temp = 0;
                if (arr[j] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.print(arr[i]+",");
        }
    }
}
