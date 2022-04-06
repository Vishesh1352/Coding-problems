public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double size1=num1.length;
        double size2=num2.length;
        double size=size1+size2;
        double median=0;
        if(size%2==0){
            median=num1[size/2];
        }
        else{
            median=num1[((size+1/2)+(size/2))/2];
        }
    }
}
