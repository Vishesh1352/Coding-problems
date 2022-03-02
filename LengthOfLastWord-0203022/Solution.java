class Solution {
    public int lengthOfLastWord(String s) {
        String arr[] = s.split(" ");
       int i=arr.length-1;
        String ad = arr[i];
            int Ans = ad.length();
        return Ans;
        }
}