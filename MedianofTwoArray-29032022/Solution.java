public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int  size1=nums1.length;
        int size2=nums2.length;
        int size=size1+size2;
        double median=0;
        if(size%2==0){
            median=nums1[size/2];
        }
        else{
            median=nums1[((size+1/2)+(size/2))/2];
        }
    }
}
