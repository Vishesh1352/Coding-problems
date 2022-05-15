class Solution {
    public int reverse(int x) {
       if(x < Math.pow(-2,31) || x > (Math.pow(2,31) - 1)){
            return 0;
        }
        
        StringBuilder str = new StringBuilder(String.valueOf(x));
        String st = str.reverse().toString();
        
        boolean flag = false;
        if(st.charAt(st.length() - 1) == '-'){
           
        }
        
        int number = Integer.parseInt(st);
        return number;
    }      
}