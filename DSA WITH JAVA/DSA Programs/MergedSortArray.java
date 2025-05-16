public class MergedSortArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int back = n - 1, front = m - 1;
        if (m == 0) {
            for (int i = 0; i < n; i++) {
                nums1[i] = nums2[i];
            }
        } else {
            for (int i = m + n - 1; front >= 0 && back >= 0; i--) {
                if (nums2[back] > nums1[front]) {
                    nums1[i] = nums2[back];
                    back--;
                } else {
                    nums1[i] = nums1[front];
                    front--;
                }
            }
            if (front != 0 && back == 0) {
                for (int i = 0; i <= front; i++) {
                    nums1[i] = nums2[i];
                }
            }
        }
    }
}

