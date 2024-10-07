class P88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int ptr1 = m-1, ptr2 = n-1, idx = m+n-1;

        while(ptr1 >= 0 && ptr2 >= 0){
            if(nums2[ptr2] >= nums1[ptr1]){
                nums1[idx--] = nums2[ptr2--];
            } else {
                nums1[idx--] = nums1[ptr1--];
            }
        }

        if(ptr1 < 0){
            while(ptr2 >=0 ){
                nums1[idx--] = nums2[ptr2--];
            }
        } else {
            while(ptr1 >=0 ){
                nums1[idx--] = nums1[ptr1--];
            }
        }     
    }
}