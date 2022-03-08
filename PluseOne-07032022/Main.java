    class Main {
        public static void main(String[] args) {
            int number = 0;
            int [] arr = new int[2];
            arr[0] = 1;
            arr[1] = 2;
            for(int i = 0; i<arr.length; i++){
                number = number + (arr[i] * (int)Math.pow(10, (arr.length - (i+1))));
            }
            int result = number + 1;
            ArrayList<Integer> al = new ArrayList<>();
            intToArray(result, al);
            System.out.println(al.toString());
        }
        
        
        static void intToArray(int num, ArrayList<Integer> al){
            if( num != 0){
                int temp = num %10;
                num /= 10;
                intToArray(num, al);
                al.add(temp);
            }
        }
    
    
}
