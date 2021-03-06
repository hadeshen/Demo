package week1.day05;

public class MiFind {
    public static void main(String[] args) {
        int[] nums = {-5, 0, 1, 2, 3, 5, 7, 9, 10, 15, 20, 28, 50, 56};
        System.out.println(searchInsert(nums, 56, 0, nums.length - 1));
    }

    public static final int searchInsert(int[] nums, int target, int left, int right) {
        if (nums == null) {
            throw new NullPointerException("目标数组为空!");
        }
        //边界条件
        if (target > nums[right] || target < nums[left]) {
            return -1;
        }
        if (right == left && nums[left] != target) {
            return -1;
        }
        if (nums[left] == target) {
            return left;
        }
        if (nums[right] == target) {
            return right;
        }
        while (true) {
            //计算当前中点
            int mid = left + (right - left) / 2;
            //找到目标值
            if (target == nums[mid]) {
                return mid;
            }
            //未找到目标值但终止循环
            if (right == left + 1) {
                return -1;
            }
            if (target > nums[mid]) {
                left = mid;
            }
            if (target < nums[mid]) {
                right = mid;
            }
        }
    }
}
