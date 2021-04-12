import java.util.HashSet;

public class Solution {

    public int findMax(String str) {
        HashSet<Character> set = new HashSet<>();
        int index = 0;
        int max = 0;
        for (int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            if (!set.contains(c)) {
                set.add(c);
                if (set.size() > max) max = set.size();
            }
            else {
                while (set.contains(c)) {
                    set.remove(str.charAt(index++));
                }
                set.add(c);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String str = "aaa";
        String str2 = "";
        String str3 = "ab1231a";
        String str4 = "*b/ds#";
        String str5 = "a";
        Solution solution = new Solution();
        System.out.println(solution.findMax(str4));
    }
}
