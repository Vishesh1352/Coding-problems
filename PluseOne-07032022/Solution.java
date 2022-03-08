class Solution {
    public int[] plusOne(int[] digits) {
        String s="";
        for (int i=0; i<digits.length-1 ;i++){
             s=""+digits[i];
        }
        int se = Integer.parseInt(s);
        se+=1;
        String Ans=se+"";
        int l=Ans.length();
        int[] So =new int[l];
        for(int i=0;i<Ans.length();i++){
            char c=Ans.charAt(i);
            So[i]=Character.getNumericValue(c);
        }
        return So;
    }
}