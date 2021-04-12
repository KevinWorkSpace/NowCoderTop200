public class Search {

    public int search (int[] nums, int target) {
        // write code here
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                for (int i=mid; i>=0; i--) {
                    if (nums[mid] != nums[i]) {
                        return ++i;
                    }
                }
            }
            else if (nums[mid] > target) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        return -1;
    }

}
