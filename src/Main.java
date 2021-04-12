import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            if (a == b) {
                System.out.println(0);
                continue;
            }
            int father = findFather(1, a, b);
            if (father == a || father == b) {
                int res = findDis1(father, a, b);
                System.out.println(res);
            } else {
                int res = findDis(father, a) + findDis(father, b);
                System.out.println(res);
            }
        }
    }

    public static int findDis(int root, int n) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        boolean f = false;
        int cnt = -1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            if (f) cnt ++;
            for (int i=0; i<size; i++) {
                int node = queue.poll();
                if (node == root) {
                    f = true;
                    cnt ++;
                }
                if (node == n) return cnt;
                if (node > n) break;
                queue.add(node * 2);
                queue.add(node * 2 + 1);
            }
        }
        return 0;
    }

    public static int findDis1(int root, int a, int b) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        int cnt = 0;
        boolean f = false;
        while (!queue.isEmpty()) {
            int size = queue.size();
            if (f) cnt ++;
            for (int i=0; i<size; i++) {
                int node = queue.poll();
                if (node == root) f = true;
                else if (node == a || node == b) {
                    return cnt;
                }
                if (node > a && node > b) break;
                queue.add(node * 2);
                queue.add(node * 2 + 1);
            }
        }
        return 0;
    }

    public static int findFather(int root, int a, int b) {
        if (root > a && root > b) return 0;
        if (root == a || root == b) return root;
        int n1 = findFather(root * 2, a, b);
        int n2 = findFather(root * 2 + 1, a, b);
        if (n1 > 0 && n2 > 0) return root;
        if (n1 != 0) return n1;
        return n2;
    }
}
