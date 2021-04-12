import java.util.*;

public class ThreeSum2 {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length < 3) return res;
        Arrays.sort(nums);
        for (int i=0; i<nums.length; i++) {
            if (nums[i] > 0) return res;
            if (i != 0 && nums[i] == nums[i-1]) continue;
            int l = i + 1;
            int r = nums.length - 1;
            while (l < r) {
                if (nums[i] + nums[l] + nums[r] == 0) {
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[l]);
                    list.add(nums[r]);
                    res.add(list);
                    while (l < r && nums[l] == nums[l+1]) l++;
                    while (l < r && nums[r] == nums[r-1]) r--;
                    l ++;
                    r --;
                }
                else if (nums[i] + nums[l] + nums[r] > 0) {
                    r --;
                }
                else l ++;
            }
        }
        return res;
    }
}
