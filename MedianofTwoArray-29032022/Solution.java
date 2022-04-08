public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int  size1=nums1.length-1;
        int size2=nums2.length-1;
        int size=size1+size2;
        double median=0;
        int[] numsa= nums1 + nums2;
        if(size%2==0){
            median=nums1[size/2];
        }
        else{
            median=nums1[((size+1/2)+(size/2))/2];
        }
        return median;
    }
}
