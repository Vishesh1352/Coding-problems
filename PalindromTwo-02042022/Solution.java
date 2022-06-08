public class Solution {
    public boolean vaildPalindrom(String s){
    int n = s.length();
    StringBuilder sbs=new StringBuilder();
    sbs.append(s);
    StringBuilder dsbs=new StringBuilder();
    for(int i=0 ; i<n-1 ; i++){
        System.out.println("number for loop run "+i);
        dsbs=sbs.deleteCharAt(i);
        boolean ans=chechPalindrom(dsbs);
        if(ans==true){
            return true;
        }
        else{
            continue;
        }
    }
    return false;
  }
  public boolean chechPalindrom(StringBuilder str){
    int len =str.length();
    int start=0;
    int end=len-1;
    while(start<end){
        System.out.println("inside while loop");
        if(str.charAt(start++)!=str.charAt(end--)){
            return false;
        }
    }
    return true;
  }
  
  public static void main(String []args){
      Solution so=new Solution();
      boolean palians=so.vaildPalindrom("abc");
      System.out.println("valid plindrom is "+palians);
}
}