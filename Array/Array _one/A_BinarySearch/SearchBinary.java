class SearchBinary {

    public static int search(int num[], int target) {
        int end = num.length - 1;
        int start = 0;
        while (start <= end) {
            int mid = (end + start) / 2;
            System.out.println("the mid is " + num[mid]);
            if (target == num[mid]) {
                return mid;
            }
            if (target > num[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] num = {2, 5, 6, 7, 8, 10, 20};
        int target = 20;
        System.out.println(search(num, target));

    }
}
