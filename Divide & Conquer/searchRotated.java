public class searchRotated {

    public static int recursiveSearch(int arr[], int target, int s, int e) {

        int mid = s + (e - s) / 2;
        if (arr[mid] == target) {
            return mid;
        }

        // Mid on Line1
        if (arr[s] <= arr[mid]) {
            // Left of L1
            if (arr[s] <= target && target <= arr[mid]) {
                return recursiveSearch(arr, target, s, mid - 1);
            }
            // Right of array
            else {
                return recursiveSearch(arr, target, mid + 1, e);
            }
        }

        // Mid on Line2
        else {
            // Right of L2
            if (arr[mid] <= target && target <= arr[e]) {
                return recursiveSearch(arr, target, mid + 1, e);
            }
            // Left of array
            else {
                return recursiveSearch(arr, target, s, mid - 1);
            }
        }
    }

    public static int loopSearch(int nums[], int target) {
        int s = 0;
        int e = nums.length - 1;
        int mid = s + (e - s) / 2;

        while (s <= e) {
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[s] <= nums[mid]) {
                if (nums[s] <= target && target <= nums[mid]) { //Left 
                    e = mid - 1;
                } else { //right
                    s = mid + 1;
                }
            } else { //L2
                if (nums[mid] <= target && target <= nums[e]) { //Right
                    s = mid + 1;
                } else {
                    e = mid - 1; //left
                }
            }
            mid = s + (e - s) / 2;
        }
        return -1;

    }

    public static void main(String args[]) {
        int num[] = { 4, 5, 6, 7, 0, 1, 2 };
        int answer = recursiveSearch(num, 0, 0, num.length - 1);
        System.out.println(answer);

        int answer2 = loopSearch(num, 0);
        System.out.println(answer2);
    }
}
