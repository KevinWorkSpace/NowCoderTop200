public class MySort {

    public int[] MySort (int[] arr) {
        quickSort(arr, 0, arr.length-1);
        return arr;
    }

    public void quickSort(int[] arr, int left, int right) {
        if (right <= left) return;
        int L = left;
        int R = right;
        int pivot = arr[left];
        while (left < right) {
            while (left < right && arr[right] > pivot) {
                right --;
            }
            if (left < right) arr[left] = arr[right];
            while (left < right && arr[left] < pivot) {
                left ++;
            }
            if (left < right) arr[right] = arr[left];
        }
        arr[left] = pivot;
        quickSort(arr, L, left-1);
        quickSort(arr, left+1, R);
    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 1, 2, 0, 0};
        MySort mySort = new MySort();
        mySort.MySort(arr);
    }
}
