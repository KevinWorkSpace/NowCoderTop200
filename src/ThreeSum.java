import java.util.ArrayList;
import java.util.Arrays;

public class ThreeSum {

    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Arrays.sort(num);
        for (int i=0; i<num.length; i++) {
            if (num[i] > 0) break;
            if (i != 0 && num[i] == num[i-1]) continue;
            int l = i + 1;
            int r = num.length - 1;
            while (l < r) {
                if (num[l] + num[r] + num[i] == 0) {
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(num[i]);
                    list.add(num[l]);
                    list.add(num[r]);
                    res.add(list);
                    while (l < r && num[l] == num[l+1]) l ++;
                    while (l < r && num[r] == num[r-1]) r --;
                    l ++;
                    r --;
                }
                else if (num[l] + num[r] + num[i] > 0){
                    r --;
                }
                else l ++;
            }
        }
        return res;
    }
}
