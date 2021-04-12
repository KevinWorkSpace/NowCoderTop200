import java.util.PriorityQueue;

public class FindKth {

    public int findKth(int[] a, int n, int K) {
        // write code here
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i=0; i<a.length; i++) {
            if (pq.size() < K) {
                pq.add(a[i]);
            }
            else if (a[i] > pq.peek()) {
                pq.poll();
                pq.add(a[i]);
            }
        }
        return pq.peek();
    }
}
