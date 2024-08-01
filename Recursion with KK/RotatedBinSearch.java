public class RotatedBinSearch {
    public static void main(String[] args) {
        int arr[] = { 10, 11, 12, 13, 14, 1, 2, 3 };
        int target = 10;
        System.out.println(search(arr, target, 0, arr.length - 1));
    }

    static int search(int arr[], int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int mid = s + (e - s) / 2;
        if (arr[mid] == target) {
            return mid;
        }

        if (arr[mid] > arr[s] ) {
            if (arr[s]<=target && target<=arr[mid]) {
                return search(arr, target, s, mid - 1);
            } else {
                return search(arr, target, mid + 1, e);
            }
        }

        if (target <= arr[e] && target >= arr[mid]) {
            return search(arr, target, mid + 1, e);
        }
        return search(arr, target, s, mid - 1);
    }
}
