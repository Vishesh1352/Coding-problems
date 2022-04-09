public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median=0;
        int[] numsa=new int[nums1.length + nums2.length];
        int size=numsa.length-1;
        numsa=sortedArrayMerge(nums1, nums2);
        if(size%2==0){
            median=nums1[size/2];
        }
        else{
            median=nums1[((size+1/2)+(size/2))/2];
        }
    return median;
    }
    private static int[] sortedArrayMerge(int a[], int b[]) {
        int result[] = new int[a.length +b.length];
        int i =0; int j = 0;int k = 0;
        while(i<a.length && j <b.length) {
            if(a[i]<b[j]) {
                result[k++] = a[i];
                i++;
            } else {
                result[k++] = b[j];
                j++;
            }
        }
        System.arraycopy(a, i, result, k, (a.length -i));
        System.arraycopy(b, j, result, k, (b.length -j));
        return result;
    }
}
