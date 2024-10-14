class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        // pointer at last element of num1
        int i = m - 1;
        // pointer at last element of num2
        int j = n - 1;

        // pointer at last element of m+n array

        int k = (m + n) - 1;

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                // decrementing k and i to check the previous element
                k--;
                i--;
            }
            else {
                nums1[k] = nums2[j];
                // dercrement k and j
                k--;
                j--;
            }
        }
    }
}