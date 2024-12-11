public class SearchInMatrix {
    public static void main(String[] args) {

        int[][] arr =  {{18,52,45},
                        {75,65,98},
                        {41,23,87}};
        int target = 87;
        System.out.println(searchThru(arr,target));
    }

    public static String searchThru(int[][] arr, int target){
        int n = arr.length-1;
        int x = 0;
        int y = 0;
        for(int i = 0; i<=n;i++){
            for(int j=0; j<arr[i].length;j++){
                if(arr[i][j] == target){

                     x = i;
                     y = j;
                }

            }
        }
        return "output "+x+":"+y;
    }
}
