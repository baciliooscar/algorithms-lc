import java.util.Arrays;
import java.util.HashMap;

class Solution {
    static int testNumber;
    public static void main(String args[]) {
        testNumber=0;
        int[] nums;
        int target;
        String expected;

        nums = new int[]{2,7,11,15};
        target = 9;
        expected="[0, 1]";
        runTest(nums,target,expected);

        nums = new int[]{3,2,4};
        target = 6;
        expected="[1, 2]";
        runTest(nums,target,expected);

        nums = new int[]{3,3};
        target = 6;
        expected="[0, 1]";
        runTest(nums,target,expected);

        
    }
    private static void runTest(int[] nums, int target,String expected){
        testNumber++;
        System.out.println("--------Test "+testNumber+" -----------");
        System.out.println("Expected: "+expected);
        System.out.println("Actual:   "+Arrays.toString(twoSum(nums,target)));

    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> solutionMap=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(solutionMap.containsKey(target-nums[i])){
                return new int[]{solutionMap.get(target-nums[i]),i};
            }
            solutionMap.put(nums[i], i);
        }
        return new int[]{-1,-1};
    }
}