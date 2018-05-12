package FinalExamReview;

public class Switch {
    public static void main(String[] args) {

        //	int[] nums = {2,1,2,3,4};
        //	int[] nums = {2,2,0};
        int[] nums = { 1,3,5};
        System.out.println(countEvens(nums));
    }


    public static int countEvens(int[] nums)
    {

        int countEven = 0;
        int index = 0;
        while(index<nums.length)
        {
            if(nums[index] % 2 == 0)
                countEven++;
            index++;

        }
        return countEven;

    }
}
