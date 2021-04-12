public class JumpFloor {

    public int JumpFloor(int target) {
        if (target == 1 || target == 2) return target;
        int a = 1;
        int b = 2;
        int c = 0;
        for (int i=3; i<target+1; i++) {
            c = b + a;
            a = b;
            b = c;
        }
        return c;
    }
}
