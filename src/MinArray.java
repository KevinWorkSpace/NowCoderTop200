public class MinArray {

    public int minArray(int[] numbers) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int mid = (right - left) / 2 + left;
            if (numbers[mid] > numbers[right]) {
                left = mid + 1;
            }
            else if (numbers[mid] < numbers[right]) {
                right = mid;
            }
            else {
                right --;
            }
        }
        return numbers[left];
    }
}
