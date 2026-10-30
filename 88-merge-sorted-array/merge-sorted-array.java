class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0 , j = 0;
        if(n == 0)
        return;

        while(i < nums1.length)
        {
            if(nums1[i] == 0 && i >= m)
            {
                nums1[i] = nums2[j];
                i++;
                j++;
                continue;
            }
            if(nums1[i] == nums2[j])
            {

                int temp = nums1[i+1];
                nums1[i+1] = nums2[j];
                nums2[j] = temp;

                Arrays.sort(nums2);
                i++;
                if(i >= m)
                j++;
            }
            else if(nums1[i] > nums2[j])
            {
                int temp = nums1[i];
                nums1[i] = nums2[j];
                nums2[j] = temp;
                Arrays.sort(nums2);
            }
            i++;
        }
    }

}