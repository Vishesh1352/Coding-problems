public class Solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median=0;
        int[] numsa=new int[nums1.length + nums2.length];
        int size=numsa.length;
        numsa=sortedArrayMerge(nums1, nums2);
        if(size==1){
            median=numsa[0];
        }
        else if(size%2!=0){
            median=numsa[((size+1)/2)-1];
        }
        else{
            double medianpre=numsa[((size/2)+1)-1]+ numsa[(size/2)-1];
            median= medianpre/2;
        }
    return median;
    }
    private static int[] sortedArrayMerge(int a[], int b[]) {
        int result[] = new int[a.length +b.length];
        System.arraycopy(a, 0, result, 0, (a.length));
        System.arraycopy(b, 0, result, (a.length), (b.length ));
        int i =0; int j = 0;int k = 0;
        while(i<a.length && j <b.length) {
            if(a[i]<b[j]) {
                result[k] = a[i];
                i++;
                k++;
            } else {
                result[k] = b[j];
                j++;
                k++;
            }
        }
        return result;
    }
    public static void main(String[] args){
        double findmedian=0;
        int arr1[]={100000};
        int arr2[]={100001};
        findmedian=findMedianSortedArrays(arr1 , arr2);
        System.out.println("median of the given array is "+findmedian);
    }
}
