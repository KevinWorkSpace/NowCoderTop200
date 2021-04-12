public class Merge {

    public void merge(int A[], int m, int B[], int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int p = A.length - 1;
        while (p1 >= 0 || p2 >= 0) {
            if (p1 < 0) {
                A[p] = B[p2--];
                p --;
            }
            else if (p2 < 0) {
                A[p] = A[p1--];
                p --;
            }
            else if (A[p1] > B[p2]) {
                A[p] = A[p1];
                p1 --;
                p --;
            }
            else {
                A[p] = B[p2];
                p2 --;
                p --;
            }
        }
    }
}
