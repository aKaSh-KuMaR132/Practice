package LeetCode;

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

public class FindEvenNoDigit {
    public static void main(String[] args) {

        int[] arr = {456,25,1,63,4561};
        int ans = findNumbers(arr);
//        System.out.println(ans);
        System.out.println(digit2(6454));

    }
    static int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
//method 1
    static boolean even(int num) {
        int numebrOfDigits= digit(num);
        return numebrOfDigits %2 == 0;
    }

    static int digit(int num){
        if(num<0){
            num = num*-1;
        }
        if(num==0){
            return 1;
        }
        int count=0;
        while(num>0){
            count++;
            num = num/10;
        }
        return count;
    }

    static int digit2(int num){
        if(num<0){
            num = num*-1;
        }
        if(num==0){
            return 1;
        }

        return (int) (Math.log10(num))+1;
    }



    //method 2
//     static boolean even(int num) {
//        String str = num+"";
//        if(str.length()%2 == 0){
//            return true;
//        }
//
//         return false;
//     }


}
