class Solution3 {
    public int[] plusOne(int[] digits) {
      
        ArrayList<Integer> al =new ArrayList<Integer>();
        for(int j=0;j<=digits.length-1;j++){
                    al.add(digits[j]);
                }
                Plus(al);
                int size=al.size()-1;
                int[] ans=new int[size];
         for(int j=0;j<size;j++){
                    ans[j]=al.get(j);
                }
                return ans;
            }
       
            static void Plus(ArrayList<Integer> arr){
                for(int i=arr.size()-1;i>=0;i++){
                    if(arr.get(i)!=9){
                        int last= arr.get(i);
                        last++;
                        arr.add(i,last);
                        break;
                    }
                    else{
                        for(int z=arr.size()-1;z>=0;z--){
                            int next = arr.get(z);
                            next++;
                            arr.add(z,0); 
                        }
                     }
                }
            }
}
                
                    
             