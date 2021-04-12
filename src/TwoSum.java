import java.util.HashMap;

public class TwoSum {

    public int[] twoSum (int[] numbers, int target) {
        // write code here
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<numbers.length; i++) {
            int num = numbers[i];
            if (map.containsKey(target - num)) {
                int[] res = new int[2];
                res[0] = map.get(target - num);
                res[1] = i+1;
                return res;
            }
            else {
                map.put(num, i+1);
            }
        }
        return null;
    }
}
