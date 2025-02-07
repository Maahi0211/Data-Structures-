import java.util.ArrayList;

public class TwoSum {
    public static ArrayList<Integer> func(int []nums, int target){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]+nums[i+1]==target){
                list.add(nums[i]);
                list.add(nums[i+1]);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int []nums = {1,2,2,3,4,5,6,7,-7,8,-8};
        int target = 13;
        TwoSum ts= new TwoSum();
        ArrayList<Integer> z=ts.func(nums,target);
        System.out.println(z);
    }
}
