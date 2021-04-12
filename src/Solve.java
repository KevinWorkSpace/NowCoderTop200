public class Solve {

    public String solve (int M, int N) {
        // write code here
        String s = "0123456789ABCDEF";
        StringBuffer res = new StringBuffer();
        boolean f = false;
        if (M < 0) f = true;
        M = Math.abs(M);
        while (M > 0) {
            res.append(s.charAt(M % N));
            M /= N;
        }
        if (f) res.append("-");
        return res.reverse().toString();
    }
}
