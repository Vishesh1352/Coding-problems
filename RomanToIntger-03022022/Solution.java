class Solution {
    public int romanToInt(String s) {
         
        int n = s.length();
        int sum = 0;
        
        
        }
        
        return sum;
    }
    
    private int getValue(char ch){
        switch(ch){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;  
        }
    }
}