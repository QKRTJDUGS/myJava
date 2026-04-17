public class Exam05 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 5, 6, 7, 8, 9};
        int max = nums[0];

        for(int i = 1 ; i < nums.length; i++){
            if(max < nums[i]){
                max = nums[i];

            }

        }
        System.out.print( max + "입니다");
    }
    
}
